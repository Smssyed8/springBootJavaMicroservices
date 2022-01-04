package Algorithms;

public class NegativeFrontArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  { -2, -1, -3, 10,20,-5,-15,40,50}; /// 10, -5    /// -5, -15, 20
		int temp;
		int j = 0;
		int prev = 0;
		for(int i = 0; i < arr.length; i++) {
		
			if(arr[i] < 0) {
				temp = arr[j];
				if(temp > 0) {
					arr[j] = arr[i];
					arr[i] = temp;
					j++;
				} else {
					j++;
					temp = arr[j];
					arr[j] = arr[i]; // 
					arr[i] = temp;
				}
			
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
