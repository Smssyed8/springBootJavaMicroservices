package Algorithms;

public class Altti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Syed";
		// StringBuilder sb = new StringBuilder();
		// sb.append(s);
		// sb.reverse();

		int i = s.length();
		int j = 0;
		int n = s.length() ;
		try {
			String r = recursiveM(s, i);
			String x = recursiveMX(s, n, j);
			// String x = recursiveM(sb.toString(), i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	  public static String recursiveM(String s, int i) { //i++; 
		  if(i == 0) { return
	  s; } System.out.println(s); 
	  i--; 
	  String r = recursiveM(s.substring(0, i), i);
	  return r; }
	 

	public static String recursiveMX(String s, int n, int j) {
		// i++;
		if (j == n ) {
			return s;
		}
		System.out.println(s);
		//System.out.println(n);
		//System.out.println(j);
		n = s.length() - 1;
		j++;
		
		String r = recursiveMX(s.substring(j, n), n  , j);
		//j--;
		return r;
	}
}
