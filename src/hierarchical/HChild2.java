package hierarchical;

public class HChild2 extends HParent {
	int d;
	public void sub()
	{
	 d=a-b;
	 System.out.println("Difference="+d);
	}
	

	public static void main(String[] args) {
		HChild2 ob2=new HChild2();
		ob2.print();
		ob2.sub();
		// TODO Auto-generated method stub

	}

}
