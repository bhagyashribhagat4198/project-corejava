package synchronization;

//synchronized method

class Table{
	 void printtable(int n){	
		 synchronized(this)  //synchronized block 
		 {
		for(int i =1;i<=5;i++){
			System.out.println(n*i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	}
	}	}
}
class sample  extends Thread{
	Table t;
	public sample(Table t) {
	this.t =t;
	}	
	public void run (){
		t.printtable(15);
	}}
public class firstexample extends Thread {
	Table t;
	public firstexample(Table t) {
	this.t =t;
	}	
	public void run (){
		t.printtable(5);
	}
	public static void main(String[] args) {
		Table obj =new Table();
		firstexample t1=new firstexample(obj);
	sample t2=new sample(obj);
	t1.start();
	t2.start();
	}
	
}
