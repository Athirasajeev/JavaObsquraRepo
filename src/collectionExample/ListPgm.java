package collectionExample;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List
				List ob=new ArrayList();
				ob.add(12);
				ob.add('A');
				ob.add("ATHIRA");
				ob.add(12.5);
				System.out.println(ob);
				List ob1=new ArrayList<String>();
				ob1.add("AMMU");
				ob1.add("ACHU");
				ob1.add("ATHIRA");
				ob1.add("ADHI");
				System.out.println(ob1);
				ob.remove(1);
				System.out.println(ob);
				ob1.remove(1);
				System.out.println(ob1);
				//ob.removeAll(ob);
				//System.out.println(ob);
				//ob1.removeAll(ob1);
				//System.out.println(ob1);
				System.out.println(ob.get(2));
				System.out.println(ob1.get(2));
				System.out.println("..........");
				Iterator itr=ob.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				itr.remove();
				System.out.println(ob);
				
	}

}
