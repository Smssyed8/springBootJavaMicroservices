
public class Node {

	int data;
	Node head;
	Node next;
	
	Node(int data){
		this.data = data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(5);
		n.head = n;
		
		int len = 5; 
		
		Node temp = n.head;
		//System.out.println(temp.data);
		for(int i = 1; i <= len; i++) {
			
			
			temp.next = new Node(i);
			System.out.println(temp.data);
			temp = temp.next;
			
			
		}
		
		temp.next = null;
		//System.out.println(temp.data);
		while(temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		
	}

}
