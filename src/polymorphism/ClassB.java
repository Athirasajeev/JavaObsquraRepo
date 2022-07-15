package polymorphism;

public class ClassB extends ClassA{
	public void test()
	{
		System.out.println(a);
		//a=a+1;
		System.out.println("Chid Class Method");
		super.test();
	}

	public static void main(String[] args) {
		ClassB ob=new ClassB();
		ob.test();
		
		// TODO Auto-generated method stub

	}

}
