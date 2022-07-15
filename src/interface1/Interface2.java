package interface1;

public class Interface2 implements Interface {
public static void main(String args[])
{
	/*Interface2 ob=new Interface2();
	//a=20;
	ob.print();
	ob.show();*/
	Interface ob=new Interface2();
	ob.print();
	//ob.show();
}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Interface Method");
		
	}
	public void show()
	{
		System.out.println("SHOW");
	}

}
