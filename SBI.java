package abstraction;

interface RBI{
	void rateofinterest();	
}
class Axis implements RBI {

	@Override
	public void rateofinterest() {
		System.out.println("Axis bank rate of interest 8%");
	}	}
class HDFC implements RBI{
	@Override
	public void rateofinterest() {
		System.out.println("HDFC bank rate of interest 9%");	
	}	}
public class SBI implements RBI {
	@Override
	public void rateofinterest() {
	System.out.println("SBI bank rate of interest 7.25%");	
	}
	public static void main(String[] args) {
		RBI obj=new SBI();
		obj.rateofinterest();
	}
}
