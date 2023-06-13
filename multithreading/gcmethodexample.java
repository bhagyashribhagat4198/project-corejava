package multithreading;

public class gcmethodexample extends Thread {

	
	public void finalize(){
		System.out.println("Object is collected");
	}
	
	public static void main(String[] args) {
		gcmethodexample t1 =new gcmethodexample();
		gcmethodexample t2=new gcmethodexample();
		t1=null;
		t2=null;
		System.gc();
	}
}
