package chap3;

import java.util.Stack;

public class Tower {
	int index;
	Stack<Integer> disks;

	public Tower(int n) {
		disks = new Stack<Integer>();
		index = n;
	}

	public void add (int n) {
		if (!disks.isEmpty() && disks.peek() <= n) {
			System.out.println("Error placing on top!");
		} else {
			disks.push(n);
		}
	}

	public boolean isEmpty() {
		return disks.isEmpty();
	}

	public int pop() {
		if (disks.isEmpty()) {
			System.out.println("Tower is empty, cannot pop disk.");
			return -1;
		} 
		return disks.pop();
	}

	public void moveTopTo(Tower t) {
		if(disks.isEmpty()) {
			System.out.println("No disk to move!");
		} else {
			int n = disks.pop();
			t.add(n);
		}
	}

	public void moveToDestination(int n, Tower destination, Tower buffer) {
		if (n == 1) {
			moveTopTo(destination);
		}
		if (n >= 2) {
			moveToDestination(n-1, buffer, destination);
			moveTopTo(destination);
			buffer.moveToDestination(n-1, destination, this);
		}
	}
}
