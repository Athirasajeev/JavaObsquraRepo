package encapsulation;

public class Student {
	private String name;
	private int age;
	/*public void getName()
	{
		System.out.println(name);
		System.out.println(age);
	}*/
public void setName(String name,int age)
{
	age=age*10;
	this.name=name;
	this.age=age;
}
public void getName()
{
	System.out.println("name:"+name);
	System.out.println("age:"+age);
}
}
