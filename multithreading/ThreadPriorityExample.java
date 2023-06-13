package multithreading;

public class ThreadPriorityExample extends Thread  {


public static void main(String[] args) {
	ThreadPriorityExample t1=new ThreadPriorityExample();
	ThreadPriorityExample t2=new ThreadPriorityExample();
	System.out.println("Default t1 priority "+t1.getPriority());
	System.out.println("Default t2 priority "+t2.getPriority());
	t1.setPriority(6);
	t2.setPriority(9);
	System.out.println(" t1 priority "+t1.getPriority());
	System.out.println(" t2 priority "+t2.getPriority());
}
}

