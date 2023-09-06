package collection;
import java.util.*;


public class HashmapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> capitalCities = new HashMap<String,Integer>();
		capitalCities.put("India",120);// to put element in the HashMap   
		capitalCities.put("USA",30);  // to put element in the HashMap
		capitalCities.put("China",150);
		System.out.println(capitalCities);
// unordered 
		capitalCities.put("India", 200);
		
		if(capitalCities.containsKey("China"))
		{
			System.out.println("key is present ");
		}
		System.out.println(capitalCities.get("India"));
 

		
		}

}
