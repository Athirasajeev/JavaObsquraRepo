package stude2;
import java.util.Scanner;
import aagregation.Student;
public class Address {
	public String hname;
	public String street;
	public String district;
	Student st;
	public Address(String hname,String street,String district,Student st)
	{
	System.out.println("House Name    :"+hname);
	System.out.println("Street    :"+street);
	System.out.println("District    :"+district);
	
	}
	
	
	/*public void addDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter House Name");
		hname=s.nextLine();
		System.out.println("Enter Street");
		street=s.nextLine();
		System.out.println("Enter District");
		district=s.nextLine();
	}
	public void printAdd()
	{
		System.out.println("House Name       : "+hname);
		System.out.println("Street           : "+street);
		System.out.println("District         : "+district);
	}*/

	public static void main(String[] args) {
		Student ob=new Student("Athira",2,"IT");
		Address ob1=new Address("HHH","MVPZHA","EKM",ob);
		System.out.println("-------------");
		Student ob2=new Student("Athira",2,"IT");
		Address ob3=new Address("HHH","MVPZHA","EKM",ob2);
		/*ob.stuDetails();
		ob1.addDetails();
		ob.print();
		ob1.printAdd();
		*/
		// TODO Auto-generated method stub

	}

}
