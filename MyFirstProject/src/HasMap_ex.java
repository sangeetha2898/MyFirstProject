import java.io.*;
import java.util.*;
import java.util.Map;
public class HasMap_ex {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer,String> ();
		hmap.put(1,"abhi");
		hmap.put(2,"bhavya");
		hmap.put(3,"chethan");
		hmap.put(4,"deeraj");
		hmap.put(5,"eshwar");
		hmap.put(6,"faraz");
		hmap.put(7,"gautham");
		hmap.put(8,"hari");
		hmap.put(9,"john");
		hmap.put(10,"kalyan");
		System.out.println(hmap);
		System.out.println("Hash Map Elements:");
		for(Map.Entry m : hmap.entrySet())
		{    
		    System.out.println(m.getKey()+" "+m.getValue());   
			
		}
		System.out.println("value of 10:"+hmap.get(10));
		
		System.out.println("Clonning hmap:"+hmap.clone());
		
		System.out.println("Contains key 4:"+hmap.containsKey(4));
		System.out.println("Conatains value hari:"+hmap.containsValue("hari"));
		System.out.println("Conatains value sana:"+hmap.containsValue("sana"));
		
		System.out.println("Is it an empty map:"+hmap.isEmpty());
		
		System.out.println("Printing all the keys:");
		 for (Integer key: hmap.keySet()) {
	            System.out.println(key);
	        }
			System.out.println("Printing all the Values:");
		 for (String val: hmap.values()) {
	            System.out.println(val);
	        }
	 
			System.out.println(hmap.remove(2,"bhavya"));
			
			HashMap<Integer,String> hmap2=new HashMap<Integer,String> ();
			hmap2.putAll(hmap);
			
			
			for(Map.Entry m1 : hmap2.entrySet())
			{    
			    System.out.println(m1.getKey()+" "+m1.getValue());   
				
			}
		
		
		
		

	}

}
