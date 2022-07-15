package superpack;

public class Divisible extends AddResult {
	public void divisibleCheck()
	{
		int r=super.addition();
		System.out.println("Addition Result ="+r);
		if(r%10==0) {
			System.out.println(r+" Is Divisible By 10");
		}
		else
		{
		System.out.println(r+" Not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible ob=new Divisible();
		ob.divisibleCheck();

	}

}
