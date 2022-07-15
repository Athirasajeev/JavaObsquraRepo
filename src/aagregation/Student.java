package aagregation;
//import java.util.Scanner;
public class Student {
	public String name;
	public int roll;
	public String dep;	
	public Student(String name,int roll,String dep)
	{
	System.out.println("Name        :"+name);
	System.out.println("Roll NUmber   :"+roll);
	System.out.println("Department       :"+dep);	
	}
	
	/*public void stuDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student Name");
		name=s.nextLine();
		System.out.println("Enter Student Department");
		dep=s.nextLine();
		System.out.println("Enter Student Roll Number");
		roll=s.nextInt();
		
		//System.out.println();
	}
	public void print()
	{
		System.out.println("Name             : "+name);
		System.out.println("Roll No          : "+roll);
		System.out.println("Department       : "+dep);
	}
	*/

}
