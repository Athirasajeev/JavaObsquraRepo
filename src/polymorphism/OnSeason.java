package polymorphism;

public class OnSeason extends OffSeason {
	public void discount(int amount)
	{
		super.discount(5000);
		int dis=amount*40/100;
		System.out.println("Discounted Price in On Season is "+dis);
	}

	public static void main(String[] args) {
		OnSeason ob=new OnSeason();
		ob.discount(5000);
		
		
		// TODO Auto-generated method stub

	}

}
