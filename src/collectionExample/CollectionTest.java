package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList(); //Non-generic Array List
		System.out.println("NON GENERIC ARRAY LIST METHODS");
		al.add(12);
		al.add("Aswani");
		al.add('d');
		al.add(1.23f);
		System.out.println("ARRAY LIST ITEMS ADDED");
		System.out.println(al);
		System.out.println("GENERIC ARRAY LIST METHODS");
		ArrayList alg =new ArrayList<String>(); //Generic Array List
		alg.add("ATHIRA");
		alg.add("KARTHIK");
		alg.add("ADHIDHAKSH");
		System.out.println("ITEMS ADDED IN GENERIC ARRAY LIST");
		System.out.println(alg);
		//al.removeAll(al);
		//System.out.println("FIRST ARRAY LIST DELETED");
		System.out.println(al);		
		alg.remove(0);
		System.out.println("FIRST OBJECT OF SECOND ARRAYLIST Is REMOVED");
		System.out.println(alg);
		alg.addAll(al);
		System.out.println(alg);
		//alg.get(2);
		System.out.println(alg.get(2));
		System.out.println("Size="+alg.size());
		Boolean b=alg.contains("Hai");
		System.out.println(b);
		Boolean b1=al.contains("ATHIRA");
		System.out.println(b1);
		
		
		//List
		//List ob=new ArrayList();//Non-Generic ArrayList(Its An Interface)
		//Use the above methods in the List Interface
		
		
		//Iterator		
		Iterator itr=new alg.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	

	}

}
