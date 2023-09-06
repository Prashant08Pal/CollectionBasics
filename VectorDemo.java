package collection;

import java.util.Vector;
 

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v=new Vector();
		
		v.add("MG");     //Collection method 
		v.add(1,"rahul");     // list method 
		v.addElement("Akarsh"); // vector class method
		v.add(3,"Alok" );
		v.add(4,"Alok");
		v.add('g');
		v.add(12.36);
		
		
		v.add("MG");    // DUPLICACY IS ALLOWED 
		
		v.add(null);
		v.add(null);   // ------>  MULTIPLE Null is allowed 
		
		
		
		System.out.println(v);
		System.out.println(v.capacity());

		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		//System.out.println(v.removeElement("MG"));
		//v.removeAllElements();
		//	v.setElementAt(4,Anchal Singh);
		System.out.println(v);


	}

}
