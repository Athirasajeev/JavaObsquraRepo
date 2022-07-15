package uncheckedException;

public class ThrowException {
	public static void testThrows(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Below 18 years is Not Eligible"); //throw an exception
			
		}
		else
		{
			System.out.println("Eligible..");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowException.testThrows(34);
	}

}
