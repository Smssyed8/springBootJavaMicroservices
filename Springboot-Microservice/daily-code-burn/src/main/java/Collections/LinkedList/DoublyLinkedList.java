package Collections.LinkedList;

public class DoublyLinkedList {

    Node head;

    class Node {
        Node prev;
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public void appendAtEnd(int data){  // method cant be static, or Node class has to be static
        /* 1. allocate node
         * 2. put in the data */
        Node new_node = new Node(data);

        Node last = head; /* used in step 5*/

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.prev = last;
    }

    public void addToFirst(int data){
        /* 1. allocate node
         * 2. put in the data */
        /* 3. Make next of new node as head and previous as NULL */
        /* 4. change prev of head node to new node */
        /* 5. move the head to point to the new node */
        Node new_Node = new Node(data);
        new_Node.next = head;
        new_Node.prev = null;

        if (head != null)
            head.prev = new_Node;

        head = new_Node;
    }

    public void insertAfter(Node prev_Node, int new_data){

        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        /* 2. allocate node
         * 3. put in the data */
        Node new_node = new Node(new_data);

        /* 4. Make next of new node as next of prev_node */
        new_node.next = prev_Node.next;

        /* 5. Make the next of prev_node as new_node */
        prev_Node.next = new_node;

        /* 6. Make prev_node as previous of new_node */
        new_node.prev = prev_Node;

        /* 7. Change previous of new_node's next node */
        if (new_node.next != null)
            new_node.next.prev = new_node;

    }

    public void insertBefore(Node nextData, int data){
        Node newNode = new Node(data);

        if(nextData == null){
            return;
        }

        newNode.prev = nextData.prev;
        nextData.prev = newNode;
        newNode.next = nextData;

        if(newNode.next != null){
            newNode.prev.next = newNode;
        } else {
            head = newNode;
        }
    }

    public void printList(Node node) {
       Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.appendAtEnd(5);
        dll.addToFirst(6);
        dll.addToFirst(7);
        dll.addToFirst(8);

        dll.addToFirst(2);
        dll.appendAtEnd(0);


        dll.insertAfter(dll.head, 1);
        //dll.insertBefore(dll.head.next, 0);

        dll.printList(dll.head);
    }
}
