package uncheckedException;
import java.util.Scanner;
public class TestEg {
String st;
int arr[]=new int[4];
public void getArray()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Array Values");
	try {
	for(int i=0;i<8;i++) {
		arr[i]=s.nextInt();
	}
	}
	catch(Exception o){
		System.out.println(o);
	}
}
public void print()
{
	try {
	System.out.println(st.length());
	}
	catch(Exception ob)
	{
		System.out.println(ob);
	}
	System.out.println("Null pointer Exception Hnadled...End Of The Method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unchecked Exceptions");
		TestEg ob=new TestEg();
		ob.print();
		ob.getArray();
		System.out.println("Array Index Exception Handled");
		


	}

}
