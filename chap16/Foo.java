import java.util.concurrent.Semaphore;

public class Foo {
	Semaphore s1;
	Semaphore s2;
	Semaphore s3;

	public Foo(){
		try{
			s1 = new Semaphore(1);
			s2 = new Semaphore(1);
			s3 = new Semaphore(1);
			s1.acquire();
			s2.acquire();
			s3.acquire();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void First(){
		try{
			s1.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Second(){
		try{
			s1.acquire();
			s1.release();
			s2.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Third(){
		try{
			s2.acquire();
			s2.release();
			s3.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
