package collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
 
		Stack s=new Stack();
		s.push("deepak");
		s.push("shobhit");
		s.push("MG");
		s.push("200");
		s.push(100.10); 
		
		System.out.println(s);
		
		//System.out.println(s.pop());
		
		System.out.println(s);

		//System.out.println(s.pop());
		
		System.out.println(s.peek());
		
		System.out.println(s.search("shobhit"));
		System.out.println(s.empty());
		
		
	}
	
	

}
//8 september,2023   2:00 pm