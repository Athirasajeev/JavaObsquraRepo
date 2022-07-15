package aagregation;
//import java.util.Scanner;
import encapsulation.Bank;
public class User {
	/*public void userDetails() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=s.nextLine();
		System.out.println("Select Your Pin");
		int upin=s.nextInt();
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.setPin(1061);
		b.validatePin();
		
	}

}
