package inhassignment;
import java.util.Scanner;
public class ClassGet {
	int bp,ded,bonus;
	public void GetData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Pay");
		bp=s.nextInt();
		System.out.println("Enter Deduction");
		ded=s.nextInt();
		System.out.println("Enter Bonus Amount");
		bonus=s.nextInt();
	}
	
	

}
