package interface1;
public class HDFC implements RBI {
	int d;
	int a;
	@Override
	public void recurringDeposit(int amount, int duration) {
		this.a=amount;
		this.d=duration;
		System.out.println("WELCOME TO HDFC");
		System.out.println("!!!!!!!!!!!!!!!!");
		System.out.println("RECURRING AMOUNT DETAILS");
		System.out.println("*************************");
		double v=Math.pow((1+rate), duration);
		double matureAmount=a*v;
		System.out.println("Matured Amount  ="+matureAmount+"/-");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI ob=new HDFC();	
		ob.recurringDeposit(50000, 1);
		
	}
	

}
