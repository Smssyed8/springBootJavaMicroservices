package com.dailyCodeBurn;

//https://mkyong.com/java/java-read-a-file-from-resources-folder/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class CryptoUtils {

	/*
	 * @Autowired ResourceLoader resourceLoader;
	 */
	ClassLoader classLoader = getClass().getClassLoader();

	static void fileProcessor(int cipherMode, File key, File inputFile, File outputFile) throws URISyntaxException {
		try {
			
			
			
			/*
			 * SecureRandom random = new SecureRandom(); byte[] salt = new byte[16];
			 * random.nextBytes(salt);
			 * 
			 * KeySpec spec = new PBEKeySpec("password".toCharArray(), salt, 65536, 256); //
			 * AES-256 SecretKeyFactory f =
			 * SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1"); byte[] key =
			 * f.generateSecret(spec).getEncoded(); SecretKeySpec keySpec = new
			 * SecretKeySpec(key, "AES");
			 * 
			 * byte[] ivBytes = new byte[16]; random.nextBytes(ivBytes); IvParameterSpec iv
			 * = new IvParameterSpec(ivBytes);
			 * 
			 * Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
			 * c.init(Cipher.ENCRYPT_MODE, keySpec, iv); byte[] encValue =
			 * c.doFinal(valueToEnc.getBytes());
			 * 
			 * byte[] finalCiphertext = new byte[encValue.length+2*16];
			 * 
			 */
			
			byte[] fileContent = Files.readAllBytes(key.toPath());
			Key secretKey = new SecretKeySpec(fileContent, "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(cipherMode, secretKey);

			FileInputStream inputStream = new FileInputStream(inputFile);
			byte[] inputBytes = new byte[(int) inputFile.length()];
			inputStream.read(inputBytes);

			byte[] outputBytes = cipher.doFinal(inputBytes);

			CryptoUtils utils = new CryptoUtils();
			/*
			 * URL url = utils.classLoader.getResource("/decrypted"); File parentDirectory =
			 * new File(new URI(url.toString())); new File(parentDirectory,
			 * outputFile.toString());
			 */
			String dir = CryptoUtils.class.getResource("/decrypted").getFile();
			// String dir = WriteResource.class.getResource("/dir").getFile();
			FileOutputStream outputStream = new FileOutputStream(outputFile);
			outputStream.write(outputBytes);
			// final PrintStream printStream = new PrintStream(os);
			// printStream.println(thing);
			// printStream.close();
			// FileOutputStream outputStream = new FileOutputStream(outputFile);
			// outputStream.write(outputBytes);

			inputStream.close();
			outputStream.close();

		} catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | BadPaddingException
				| IllegalBlockSizeException | IOException e) {
			e.printStackTrace();
		}
	}

	// get a file from the resources folder
	// works everywhere, IDEA, unit test and JAR file.
	private InputStream getFileFromResourceAsStream(String fileName) {

		// The class loader that loaded the class
		ClassLoader classLoader = getClass().getClassLoader();
		URL dir = classLoader.getResource("/decrypted");
		// System.out.println(dir);
		InputStream inputStream = classLoader.getResourceAsStream(fileName);

		// the stream holding the file content
		if (inputStream == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {
			return inputStream;
		}

	}

	private List<File> getAllFilesFromResource(String folder) throws URISyntaxException, IOException {

		System.out.println(CryptoUtils.class.getClassLoader().getResourceAsStream(folder));
		if (CryptoUtils.class.getClassLoader().getResource(folder) != null) {
			URL resource = CryptoUtils.class.getClassLoader().getResource(folder);
			System.out.println(resource.toURI());
		}
		ClassLoader classLoader = getClass().getClassLoader();

		URL resource = classLoader.getResource(folder);
		// System.out.println(resource);
		System.out.println(resource.toURI());
		// dun walk the root path, we will walk all the classes
		List<File> collect = Files.walk(Paths.get(resource.toURI())).filter(Files::isRegularFile).map(x -> x.toFile())
				.collect(Collectors.toList());

		return collect;
	}

	private Resource[] getXMLResources(String folder) throws IOException {
		ClassLoader classLoader = MethodHandles.lookup().getClass().getClassLoader();
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(classLoader);

		return resolver.getResources("classpath:decrypted");
	}

	/*
	 * The resource URL is not working in the JAR If we try to access a file that is
	 * inside a JAR, It throws NoSuchFileException (linux), InvalidPathException
	 * (Windows)
	 * 
	 * Resource URL Sample: file:java-io.jar!/json/file1.json
	 */
	private File getFileFromResource(String fileName) throws URISyntaxException {

		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {

			// failed if files have whitespaces or special characters
			// return new File(resource.getFile());

			return new File(resource.toURI());
		}

	}

	// print input stream
	private static void printInputStream(InputStream is) {

		try (InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(streamReader)) {

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Get all paths from a folder that inside the JAR file
	private List<Path> getPathsFromResourceJAR(String folder) throws URISyntaxException, IOException {

		List<Path> result;

		// get path of the current running JAR
		String jarPath = getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
		System.out.println("JAR Path :" + jarPath);

		// file walks JAR
		URI uri = URI.create("jar:file:" + jarPath);
		try (FileSystem fs = FileSystems.newFileSystem(uri, Collections.emptyMap())) {
			result = Files.walk(fs.getPath(folder)).filter(Files::isRegularFile).collect(Collectors.toList());
		}

		return result;

	}

	// print a file
	private static void printFile(File file) {

		List<String> lines;
		try {
			lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		/*
		 * File encryptedFile = new File("dockercopy1"); File decryptedFile = new
		 * File("dockercopy1");
		 * 
		 * 
		 * 
		 * // String fileName = "database.properties"; String fileName =
		 * "decrypted/dockercopy1";
		 * 
		 * System.out.println("getResourceAsStream : " + fileName); // InputStream is =
		 * app.getFileFromResourceAsStream(fileName);
		 * 
		 * // read all files from a resources folder
		 * 
		 * try {
		 * 
		 * // files from src/main/resources/json List<File> result =
		 * app.getAllFilesFromResource("decrypted/"); for (File file : result) {
		 * System.out.println("file : " + file); // printFile(file); }
		 * 
		 * } catch (URISyntaxException | IOException e) { e.printStackTrace(); }
		 */
		// Sample 3 - read all files from a resources folder (JAR version)
		/*
		 * try {
		 * 
		 * // get paths from src/main/resources/json List<Path> result =
		 * app.getPathsFromResourceJAR("json"); for (Path path : result) {
		 * System.out.println("Path : " + path);
		 * 
		 * String filePathInJAR = path.toString(); // Windows will returns
		 * /json/file1.json, cut the first / // the correct path should be
		 * json/file1.json if (filePathInJAR.startsWith("/")) { filePathInJAR =
		 * filePathInJAR.substring(1, filePathInJAR.length()); }
		 * 
		 * System.out.println("filePathInJAR : " + filePathInJAR);
		 * 
		 * // read a file from resource folder InputStream isp =
		 * app.getFileFromResourceAsStream(filePathInJAR); // printInputStream(isp); }
		 * 
		 * } catch (URISyntaxException | IOException e) { e.printStackTrace(); }
		 */
		// printInputStream(is);
		/*
		 * Resource resource = resourceLoader.getResource("classpath:data.txt");
		 * InputStream inputStream = resource.getInputStream();
		 */

		
		
		//byte[] fileContent = Files.readAllBytes(inputFile);
		try {
			String key = "This is a secret";
			CryptoUtils app = new CryptoUtils();
			//String inputFile = "";
			File encryptK = new File("encrypt.txt");
			File inputFile = app.getFileFromResource("text.txt");
			List<String> fileNames = new ArrayList<String>();
			List<File> result = app.getAllFilesFromResource("decrypted/");
			
			//byte[] fileContent = Files.readAllBytes(inputFile.toPath());
			//CryptoUtils.fileProcessor(Cipher.ENCRYPT_MODE, inputFile, inputFile, encryptK);
			
			int j = 0;
			for (File fileV : result) {
				j++;
				fileNames.add(fileV.getName());
				File encryptedFil = new File("dept/encr_" + j);
				File decryptedFil = new File(fileV.getName());
				CryptoUtils.fileProcessor(Cipher.ENCRYPT_MODE, inputFile, fileV, encryptedFil);
				//CryptoUtils.fileProcessor(Cipher.DECRYPT_MODE, inputFile, encryptedFil, decryptedFil);
			}

			FileWriter writer = new FileWriter("dept/namePt.txt");
			int i = 0;
			for (String str : fileNames) {
				i++;
				writer.write(i+" - "+str + System.lineSeparator());
			}
			writer.close();

			System.out.println(fileNames);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}