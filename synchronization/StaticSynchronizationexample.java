package synchronization;

class Series{
	 synchronized static void printseries(int n){	
		
		for(int i =1;i<=5;i++){
			System.out.println(n*i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	}
	}	}
class Test  extends Thread{
		
	public void run (){
		Series.printseries(11);
	}}
public class StaticSynchronizationexample extends Thread {

	public void run(){
		Series.printseries(1);
	}

public static void main(String[] args) {
	StaticSynchronizationexample t1=new StaticSynchronizationexample();
	Test t2=new Test();
	t1.start();
	t2.start();
}
}