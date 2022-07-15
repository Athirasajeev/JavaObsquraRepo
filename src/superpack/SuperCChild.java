package superpack;

public class SuperCChild extends SuperCParent {
	//static int a=90;
public SuperCChild()
{
	super(234);
	System.out.println("Super Child Constructor");
}
public void print(int a)
{
	 
System.out.println("ITS A METHOD "+a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCChild ob=new SuperCChild();
		ob.print(123);
	}

}
