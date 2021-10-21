package at.top.com.dcbjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import datastructures.arrays.ArrayMain;

@SpringBootApplication
public class DailyCodeBurnJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyCodeBurnJavaApplication.class, args);
		
		ArrayMain arrayMain = new ArrayMain();
		arrayMain.main(args);
	}

}
