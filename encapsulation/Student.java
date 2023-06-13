package encapsulation;

public class Student {

	
	private String name;
	
	//setter method
	public void setName(String name){
		this.name=name;
	}
	
	//getter method
	public void getName(){
		System.out.println("Name = "+name);
	}
}
