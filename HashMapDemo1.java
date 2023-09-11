package collection;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap( );
		hm.put(101,"Prashant");
		hm.put(102,"Ansh pal");
		hm.put(103,"Krishna");
		hm.put(104,"Radha");
		
		
		//hm.remove(103);
		
		//System.out.println(hm.containsKey(104));
		//System.out.println(hm.containsValue("Prashant"));

		//System.out.println(hm.get(109));
		//System.out.println(hm.isEmpty());
		System.out.println(hm);
		
//		Set set=hm.entrySet();
//		System.out.println(set);
		
//		for(Map.Entry me:hm.entrySet())
//		{
//		System.out.println(me.getKey()+"- >"+me.getValue());
// 		}
//		
		
		
		
		
		
		
		
		
//		Iterator itr=set.iterator();
//		while (itr.hasNext())
//		{
//			//System.out.println(itr.next());
//			Map.Entry entry =(Map.Entry)itr.next();
//			System.out.println(entry.getKey()+"- >"+entry.getValue());
//		}
	}

}