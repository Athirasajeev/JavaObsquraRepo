package encapsulation;

public class Bank {
	
	private int pin;
	
	public void setPin(int p)
	{
		System.out.println("-------------------");
		System.out.println("WELCOME");
		
		this.pin=p;
	}
public void validatePin()
{
	
	if(pin==1001||pin==1234||pin==1212) {
		System.out.println("Valid User");
		System.out.println(" Continue Banking");
	}
	else
	{
		System.out.println("Pin is Wrong....");
		System.out.println("Invalid User...");
	}
}
}
