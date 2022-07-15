package inheritance;

public class Cclass extends Bclass {
	int d;
	public void multi()
	{
	d=a*b;
	System.out.println("Product="+d);
	}
	public void results()
	{
		int e=c+d;
		System.out.println("Results Sum="+e);
	}

	public static void main(String[] args) {
		Cclass ob=new Cclass();
		
		ob.addition();
		ob.multi();
		ob.results();
		// TODO Auto-generated method stub

	}

}
