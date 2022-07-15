package abstraction;

public class FullTimeEmployee extends Employee {
	
	final int h=8;
public void calculateSalary(int p)
{ 
	//this.payement=p;
	int salary=p*h;
	System.out.println("Salary of Full Time Employee    =   "+salary);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor ob1=new Contractor();
		
		ob1.calculateSalary(200);
		FullTimeEmployee ob=new FullTimeEmployee();
		ob.calculateSalary(200);

	}

}
