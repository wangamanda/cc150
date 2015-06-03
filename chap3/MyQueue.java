import java.util.Stack;
import java.util.ArrayList;
public class MyQueue{
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			myQueue.push(n);
		}
		while (!myQueue.isEmpty()) {
			System.out.print(myQueue.pop()+" ");
		}
		System.out.println();
	}
	Stack<Integer> stackIn = new Stack<Integer>();
	Stack<Integer> stackOut = new Stack<Integer>();
	void push(int n) {
		stackIn.push(n);
	}

	int pop() {
		if(isEmpty()) {
			return -1;
		}
		if (stackOut.isEmpty()) {
			while(!stackIn.isEmpty()) {
				stackOut.push(stackIn.pop());
			}
		}
		return stackOut.pop();
	}

	boolean isEmpty() {
		return stackIn.isEmpty() && stackOut.isEmpty();
	}
}
