package multithreading;

public class SleepExample  extends Thread{
	public void run(){
		for(int i =0;i<=5;i++){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SleepExample t1=new SleepExample();
		SleepExample t2=new SleepExample();
		t1.start();
		t2.start();
	}
	
}
