package Algorithms;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,5,9,6,5,3,1,2};
		int n = arr.length;
		int rhs = 0;
		int rhsIndex = 0;
		int lhs = 0;
		int temp = 0;
		int lhsIndex = 0;
		for(int i = 0; i < n; i++) {                    /// i = 0 j = 7, 6, 5, 4, 3, 2, 1, 0
			
			if(rhs == 0 && arr[i] % 2 == 0) {
				rhs = arr[i];
				if(lhs != 0) {
					//temp = rhs;
					arr[lhsIndex] = rhs;
					arr[i] = lhs;
					lhs = 0;
					continue;
				}
			} else {
				rhs = 0;
			}
			if(lhs == 0) {
				for(int j = n - 1; j >= i; j--) {
					//System.out.println(j);
					if(arr[j] % 2 != 0) {
						lhs = arr[j];
						lhsIndex = j;
						break;
					}
					
				}
			}
			
		}
		
		
		for(int k = 0; k < n; k++) {
			System.out.print(arr[k]);
		}
		
	}

}
