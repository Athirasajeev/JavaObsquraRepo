package stringeg;

public class Reve_num {
	int num,rev;
	public Reve_num()
	{
		this(12345);
		System.out.println("Reverse Of Number "+num+ " is "+rev);
	}
	public Reve_num(int num)
	{
		this.num=num;
		int temp=num;
		while(temp>0)
		{
			rev=rev*10+temp%10;
			temp=temp/10;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Reve_num ob=new Reve_num();
	}

}
