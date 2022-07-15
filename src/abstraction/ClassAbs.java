package abstraction;

public  class ClassAbs extends Abs1 {
public void absMeth()
{
System.out.println("Abstract Method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassAbs ob=new ClassAbs();
ob.absMeth();
ob.insMeth();
Abs1.statMeth();
	}

}
