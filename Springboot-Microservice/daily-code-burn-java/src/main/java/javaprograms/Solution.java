package javaprograms;

public class Solution {

	/*
	 * class Node { char value; Node left; Node right; }
	 * 
	 * public void printTopView(Node root) {
	 * 
	 * Node temp = root; System.out.println(root); while(temp.left != null){
	 * System.out.println(root.left); temp = temp.left; }
	 * 
	 * // printTopView(root.ne)
	 * 
	 * }
	 */
	
	 public static int[] prevSmaller(int[] A) {
		 //int[] arr = {4, 5, 2, 6, 10, 8};
		int temp = -1;
		int[] g = new int[A.length];
		
		
		for(int i = 0; i < A.length; i++) {
			if(i == 0) {
				g[i] = -1;
			} else {
				if(A[i] > A[i-1]) {
					temp = A[i-1];
					g[i] = temp;
				} else if(A[i] > temp) {
					//System.out.println(temp);
					g[i] = temp;
				} else {
					g[i] = -1;
				}
			}	
		}
		
		return g;
	 }

	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = {3, 2, 1};
			int[] g = prevSmaller(arr);
			try {
				for(int i=0; i < g.length; i++) {
					System.out.println(g[i]);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}