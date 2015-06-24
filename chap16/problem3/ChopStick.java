package problem3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ChopStick{
	Lock lock;

	public ChopStick(){
		lock = new ReentrantLock();
	}

	public boolean pickUp(){
		return lock.tryLock();
	}

	public void putDown(){
		lock.unlock();
	}
}
