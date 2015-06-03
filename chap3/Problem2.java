import java.util.Stack;
import java.util.ArrayList;

public class Problem2 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			array.add(n);
		}
		createStack(array);
	}

	public static void createStack (ArrayList<Integer> array) {
		MinStack stack = new MinStack();
		for (int i = 0 ; i < array.size() ; i ++ ) {
			stack.push(array.get(i));
			System.out.print(stack.peek()+" ");
			System.out.println(stack.min()+"");
		}
		System.out.println("*************************");
		while (!stack.isEmpty()) {
			System.out.print(stack.peek()+" ");
			System.out.println(stack.min()+"");
			stack.pop();
		}
	}
}

class MinStack {
	Stack<Integer> stack =  new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	boolean isEmpty() {
		return stack.isEmpty();
	}

	void push(int n) {
		stack.push(n);
		if (minStack.isEmpty() || n <= minStack.peek()) {
			minStack.push(n);
		}
	}

	int pop() {
		if (stack.isEmpty()) {
			return -1;
		}
		int n = stack.pop();
		if (!minStack.isEmpty() && minStack.peek() >= n) {
			minStack.pop();
		}
		return n;
	}

	int min() {
		if (minStack.isEmpty()) {
			return -1;
		}
		return minStack.peek();
	}

	int peek() {
		if (stack.isEmpty()) {
			return -1;
		}
		return stack.peek();
	}
}
