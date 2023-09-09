package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
 
		ArrayList<Integer> al=new ArrayList<Integer>();
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		//arrayList
		
		long startTime=System.nanoTime();
		for(int i=0;i<10000;i++)
		{
			al.add(i);
		}
		long endTime=System.nanoTime();
		System.out.println("ArrayList Add time: "+(endTime-startTime));
		
		//LinkedList
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++)
		{
			ll.add(i);
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList Add time: "+(endTime-startTime));
		//this is fast in Linked List 
		
		
		
//ArrayList ----->GET
	
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++)
		{
			al.get(i);
		}
		 endTime=System.nanoTime();
		System.out.println("ArrayList get time"+(endTime-startTime));
		//ArrayList is best get elements
		
		
		//LinkedList------->GET
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++)
		{
			ll.get(i);
		}
		 endTime=System.nanoTime();
		System.out.println("LinkedList get  time"+(endTime-startTime));
		
		//Arraylist----->remove
		
		startTime=System.nanoTime();
		for(int i=9999;i>0;i--)
		{
			al.remove(i);
		}
		 endTime=System.nanoTime();
		System.out.println("ArrayList remove time"+(endTime-startTime));
		
		
		//LinkedList--->remove
		
	startTime=System.nanoTime();
		for(int i=9999;i>0;i--)
		{
			ll.remove(i);
		}
		 endTime=System.nanoTime();
		System.out.println("LinkedListList remove time"+(endTime-startTime));
 
 
		
		

		

		
		
		
		
		
		
		
		
		
	}

}
