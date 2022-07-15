package superpack;

public class SuperChild extends SuperParent {
	public void childMethod() 
	{
		super.parentMethod();
		System.out.println("Child class method");
		System.out.println(super.a);
		System.out.println(super.b);
	}

	public static void main(String[] args) {
		SuperChild ob=new SuperChild();
		ob.childMethod();
		// TODO Auto-generated method stub

	}

}
