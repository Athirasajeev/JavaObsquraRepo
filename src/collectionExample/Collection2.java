package collectionExample;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();//Non-Generic
		arr.add(12);
		arr.add("ATHU");
		arr.add(12.2f);
		arr.add('a');
		System.out.println("FIRST ARRAY");
		System.out.println(arr);
		 
		System.out.println("Generic Array List");
		ArrayList alg =new ArrayList<String>(); //Generic Array List
		alg.add("ATHIRA");
		alg.add("KARTHIK");
		alg.add("ADHIDHAKSH");
		System.out.println("ITEMS ADDED IN GENERIC ARRAY LIST");
		System.out.println(alg);
		alg.remove(2);
		System.out.println(alg);
		alg.removeAll(alg);
		System.out.println(alg);
		//arr.get(2);
		System.out.println(arr.get(2));
		System.out.println("Size="+arr.size());
		boolean b=arr.contains("Hai");
		System.out.println(b);
		boolean b1=alg.contains("ATHIRA");
		System.out.println(b);
		
		
		
		Iterator itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(arr);
		
		
		

	}

}
