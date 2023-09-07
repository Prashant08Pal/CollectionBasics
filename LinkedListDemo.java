package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		ArrayList <String > al=new ArrayList<String>();
		al.add("100");
		al.add("200");
		al.add("300");
		al.add("400");
 LinkedList<String> l=new LinkedList<String>(al);
 
 
 
 
 
 
 l.add("deepak");
 l.add("rahul");
 l.add("Alok Kanujiya");
 l.add("Ansh Pal Singh");
 l.add("Alok Kanujiya");
 l.add("null");
 l.add("null");
 
 
 System.out.println(l);
 
 l.addFirst("MG");
 l.addLast("MG");
 l.removeFirst();
 l.removeLast();
 
 
 System.out.println(l.getFirst());
 System.out.println(l.getLast());


	}

}
 