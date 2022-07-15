package inheritance;

public class Child_class extends Parent_class {
	public void check()
	{
	System.out.println("This is child class method");
	System.out.println("A=" +a);
	}
	public static void main(String[] args) {
		Child_class ob=new Child_class();
		ob.print();
		ob.check();
		
		// TODO Auto-generated method stub

	}

}
