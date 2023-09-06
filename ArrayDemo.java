package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		List <Integer>arrayList=new ArrayList();
		System.out.println(arrayList.isEmpty());     // true 

 		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
//		arrayList.add(40);
//		arrayList.add(50);
//		arrayList.add(70);
//		arrayList.add(900);
//		arrayList.add(201);
		arrayList.add(320);
		arrayList.add(450);
		arrayList.add(502);
		arrayList.add(702);
		
		System.out.println(arrayList);   // to print all elements 
		System.out.println(arrayList.size()); //  (7)   to know the size of arrayList 
		
		System.out.println(arrayList.get(4));    

		
		
		
		
		System.out.println(arrayList.contains(30)); //  TRUE      elemnt is present in the arrayList   
		System.out.println(arrayList.contains(90)); //  FALSE      elemnt is present in the arrayList   
		System.out.println(arrayList.set(5,60));  // in set method provide two parameter (index,element); it removes the value 
		System.out.println(arrayList);   // to print all elements 

		System.out.println(arrayList.contains(60)); //   TRUE  elemnt is present in the arrayList   

		List  arrayList2=new ArrayList (arrayList);
		System.out.println(arrayList2);
		
		System.out.println(arrayList2.retainAll(arrayList));   // 
		System.out.println(arrayList2);

		
		
		System.out.println(arrayList2.removeAll(arrayList));   // 
		System.out.println(arrayList2);

		//ArrayList arrayList1=new ArrayList(2);
		//System.out.println(arrayList1);   // to print all elements 

		List arrayList3=new ArrayList(arrayList);
		arrayList3.add(501);
		arrayList3.add(502);

		System.out.println(arrayList3); 

//		for(int i=0;i<arrayList.size();i++)       //FOR LOOP 
//		{
//			System.out.println(arrayList.get(i));
//		}
		
//		for(Object i:arrayList) {         // FOR EACH LOOP 
//			System.out.println(i);
//		}
	

	

	Iterator  u= arrayList2.iterator();
	//System.out.print(u);
	while(u.hasNext()) {
		Object object =(Object)u.next();
		System.out.println(object);
	}

	
}
	}
