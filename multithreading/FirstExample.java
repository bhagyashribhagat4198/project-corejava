package multithreading;

public class FirstExample  extends Thread{

	
	public void run(){
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		FirstExample t =new FirstExample();
		t.start();
	}
}
