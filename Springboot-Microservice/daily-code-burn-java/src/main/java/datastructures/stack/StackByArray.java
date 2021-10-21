package datastructures.stack;

public class StackByArray {
	int size;
	int[] arr;

	int top = -1;

	StackByArray(int s) {
		size = s;
		arr = new int[size];
	}

	public boolean push(int v) {
		if (top == size - 1) {
			System.out.println("overflow");
			return false;
		} else {
			arr[++top] = v;
			return true;
		}

	}

	public int pop() {
		if (top == -1) {
			System.out.println("undeflow");
			return 0;
		} else {
			int v = arr[top];
			top--;
			return v;
		}

	}

	public int peek() {
		if (top == -1) {
			System.out.println("undeflow");
			return 0;
		} else {
			int v = arr[top];

			return v;
		}
	}

	public void display() {
		for (int i = top; i > -1; i--) {
			System.out.print(" " + arr[i]);
		}
	}
}
