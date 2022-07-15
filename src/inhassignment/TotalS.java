package inhassignment;

public class TotalS extends Calculation {
	int total;
	public void netsalary()
	{
	 total=bp+hra-pf-ded+bonus;
	 System.out.println("    SALARY SLIP    ");
	 System.out.println("---------------------");
	 System.out.println("BASIC PAY   :   "+bp);
	 System.out.println("DEDUCTION   :   "+ded);
	 System.out.println("HRA         :   "+hra);
	 System.out.println("PF          :   "+pf);
	 System.out.println("BONUS       :   "+bonus);
	 System.out.println("TOTAL SALARY:   "+total);
		
	}
	public static void main(String[] args) {
		
		TotalS ob=new TotalS();
		ob.GetData();
		ob.calc();
		ob.netsalary();
		// TODO Auto-generated method stub

	}

}
