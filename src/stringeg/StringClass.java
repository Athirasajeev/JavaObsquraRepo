package stringeg;
public class StringClass {
	String s1="";
	String s;
	public void reverse(String s)
	{
		this.s=s;
	int n=s.length();
	for(int i=n-1;i>=0;i--)
	{
	s1=s1+s.charAt(i);
	}
	System.out.println("Reverse of string is "+s1);
	}
	public void pali()
	{
	if(s.equalsIgnoreCase(s1))
	{
	System.out.println("Palindrome");
	}
	else
	{
	System.out.println("Not Palindrome");
	}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringClass ob=new StringClass();
	ob.reverse("mim");
	ob.pali();

	}

}
