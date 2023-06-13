package multithreading;

public class DeamonThreadExample extends Thread {

	
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Deamon thread executed");
		}
		else{
			System.out.println("User thread executed");
		}
	}
	
	public static void main(String[] args) {
		DeamonThreadExample t1=new DeamonThreadExample();
		DeamonThreadExample t2=new DeamonThreadExample();
		DeamonThreadExample t3=new DeamonThreadExample();
		t2.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}
