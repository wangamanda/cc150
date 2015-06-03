import java.util.Stack;
import java.util.ArrayList;
public class SortStack{
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			stack.push(n);
		}
		sortStack(stack);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
		System.out.println();
	}

	public static void sortStack(Stack<Integer> ascendStack) {
		Stack<Integer> descendStack = new Stack<Integer>();
		while (!ascendStack.isEmpty()) {
			int tmp = ascendStack.pop();
			if (descendStack.isEmpty() || descendStack.peek() >= tmp) {
				descendStack.push(tmp);
			} else {
				while(!descendStack.isEmpty() && descendStack.peek() < tmp) {
					ascendStack.push(descendStack.pop());
				}
				descendStack.push(tmp);
				while(!ascendStack.isEmpty() && ascendStack.peek() <= descendStack.peek()) {
					descendStack.push(ascendStack.pop());
				}
			}
		}
		while (!descendStack.isEmpty()) {
			ascendStack.push(descendStack.pop());
		}
	}

}
