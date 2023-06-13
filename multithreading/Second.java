package multithreading;

public class Second  implements Runnable{


	public void run() {
		System.out.println("Thread created by Runnable Interface");
		
	}
	public static void main(String[] args) {
		Second obj =new Second();
		Thread t =new Thread(obj);
		t.start();
	}

}
