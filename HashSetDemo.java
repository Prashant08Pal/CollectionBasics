package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList al=new ArrayList();
		al.add("APS");
		al.add("Pappu Singh");
		al.add("Amit Sir");
HashSet hs=new HashSet();

//hs.add(10);
//hs.add(100.55);
//hs.add("deepak");
//hs.add("MG");
//hs.add("alok");
//hs.add("null");
//hs.add("Mg");
//hs.add(hs);  // duplicate element  not allowed in HashSet

hs.addAll(al);


hs.add(20);
hs.add(30);   //-----> HashSet does not follow insertion order 
hs.add(400);
hs.add(800);   //----> HashSet does not follow sorting order

//hs.clear();
System.out.println(hs.size());

System.out.println(hs.contains("APS"));
System.out.println(hs);

 Iterator itr=hs.iterator();
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
	}

}
