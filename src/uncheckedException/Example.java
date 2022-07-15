package uncheckedException;

public class Example {
	int a=10;
	public void display()
	{
		try
		{
		int b=a/0;
		System.out.println(b);
		}
		/*catch(Exception ob)
		{
			System.out.println(ob);
			System.out.println("Exception Handled");
		}*/
		finally
		{
		System.out.println("End Of The Statement");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example ob=new Example();
//System.out.println("End Of The Statement");
ob.display();

	}

}
