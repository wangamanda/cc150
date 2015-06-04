package animal;

public class Animal {
	private int order;

	public Animal() {
	
	}

	public Animal(int n) {
		order = n;
	}

	public boolean isOlderThan(Animal A) {
		return this.order < A.order;
	}

	public void setOrder(int n) {
		order = n;
	}

	public int getOrder() {
		return order;
	}
}
