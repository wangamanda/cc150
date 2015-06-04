package animal;

import java.util.LinkedList;

public class Queue {

	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	public int order;	
	public static void main(String[] args) {
		Queue queue = new Queue();
		Cat cat1 = new Cat();
		queue.enqueue(cat1);
		Dog dog1 = new Dog();
		queue.enqueue(dog1);
		Cat cat2 = new Cat();
		queue.enqueue(cat2);
		System.out.println(""+queue.dequeueDog().getOrder());
	}

	public void enqueue(Animal a) {
		a.setOrder(order++);
		if(a instanceof Cat) {
			cats.offer((Cat)a);
		} else {
			dogs.offer((Dog)a);
		}
	}

	public boolean isEmpty() {
		return dogs.isEmpty() && cats.isEmpty();
	}

	public Animal dequeueAny() {
		if(isEmpty()) {
			return null;
		}

		if(dogs.isEmpty()) {
			return cats.poll();
		}

		if(cats.isEmpty()) {
			return dogs.poll();
		}

		Animal firstDog = dogs.peek();
		Animal firstCat = cats.peek();
		if(firstDog.isOlderThan(firstCat)) {
			return dogs.poll();
		}else{
			return cats.poll();
		}
	}

	public Animal dequeueDog() {
		if(dogs.isEmpty()) {
			return null;
		}
		return dogs.poll();
	}

	public Animal dequequeCat(){
		if(cats.isEmpty()) {
			return null;
		}
		return cats.poll();
	}
}
