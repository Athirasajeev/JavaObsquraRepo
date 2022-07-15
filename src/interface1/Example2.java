package interface1;

public class Example2 implements Showable2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Multilevel Inheritance");
	Example2 ob=new Example2();
	ob.print();
	ob.show();

}

	@Override
	public void show() {
		System.out.println("Showable Method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printable Method");
	}

}
