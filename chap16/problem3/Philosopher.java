package problem3;

public class Philosopher{
	ChopStick left;
	ChopStick right;

	public Philosopher(){
		left = new ChopStick();
		right = new ChopStick();
	}

	public void eat(){
		if(pickup()){
			chew();
			putdown();
		} 
	}

	public void chew(){
		System.out.println("eat");
	}

	public boolean pickup(){
		if(left.pickUp()){
			if(right.pickUp()){
				return true;
			} else {
				left.putDown();
				return false;
			}
		} else {
			return false;
		}
	}

	public void putdown(){
		left.putDown();
		right.putDown();
	}
}
