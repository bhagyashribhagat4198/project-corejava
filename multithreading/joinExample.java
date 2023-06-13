package multithreading;

public class joinExample extends Thread  {
	public void run(){
		for(int i=0;i<=2;i++){	
			try {
				Thread.sleep(500);	
			System.out.println("Current thread name is "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}}
	public static void main(String[] args) {
		joinExample t1=new joinExample();
		joinExample t2=new joinExample();	
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();}}
