package datastructures.stack;
//applications
/**
 * 1. Reverese a string
 * 2. undo mechanism in text editor -- abcde, edcba
 * 3. recursion or function call.
 * 4. balancing of parenthesis, {} 
 * 5. infix to postfix or infix to prefix
 * 6. Topological sorting, dfs, tower of hanoi, tree traversal
 * 7. For the evaluation of postfix expression
 * @author SSiddiqhi
 *
 */
public class StackMain {

	public static void main(String[] args) {
		StackByArray s = new StackByArray(5);
		s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        System.out.println();
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.display();
	}

}
