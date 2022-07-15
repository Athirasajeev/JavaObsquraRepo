package uncheckedException;

public class LicenceEg {
	public  void testThrows(int age) throws LisenceException
	{
		if(age<18)
		{
			throw new LisenceException("Below 18 years is Not Eligible"); //throw an exception
			
		}
		else
		{
			System.out.println("Eligible..");
		}
	}

	
	public static void main(String[] args) throws LisenceException  {
		LicenceEg ob=new LicenceEg();
		ob.testThrows(23);
		/*try {
			ob.testThrows(23);
		} catch (LisenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// TODO Auto-generated method stub

	}

}
