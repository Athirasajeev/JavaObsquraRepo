package hierarchical;

public class HChild1 extends HParent{
	int c;
	public void addition()
	{
		 c=a+b;
		System.out.println("Sum="+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HChild1 ob1= new HChild1();
ob1.addition();
ob1.print();
	}

}
