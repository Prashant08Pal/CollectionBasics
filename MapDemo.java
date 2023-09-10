package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
 
		Map mp=new HashMap();
		mp.put(101, "Prashant");
		mp.put(102,"Alok");
		mp.put(103,"APS");
		mp.put(104,"arya");
		
		mp.put(102, "Ansh Pal Singh");   //  if we repeat the key then values get updated 
		mp.put(105,"arya");
		mp.put(args,"surbhi");  //-----multiple keys not null  || 1 key can be null
		mp.put(args,"Kashish");
		mp.put(109, mp);
		mp.put(110, mp);
		mp.put(107, mp); //----> any numbe rof values can be null
		
		//mp.clear();
		
	//	System.out.println(mp.containsKey(1010));
		
		//System.out.println(mp.containsValue("APS"));
	
		//	System.out.println(mp.get(102));-----> key value
		
		//mp.remove(102);

		//mp.replace(101,"ravi");
		
		System.out.println(mp.size());
		
		System.out.println(mp);
		
 	}

}
