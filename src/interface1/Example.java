package interface1;

public class Example implements Printable,Showable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Multiple Inheritance");
	Example ob=new Example();
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
