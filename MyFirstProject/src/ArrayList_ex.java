import java.io.*;
import java.util.*;
public class ArrayList_ex {

	public static void main(String[] args) {
	ArrayList <String> li=new ArrayList();
	li.add("anu");
	li.add("brinda");
	li.add("charu");
	li.add("deeraj");
	li.add("eshwar");
	li.add("faraz");
	li.add("goutham");
	li.add("harsha");
	li.add("jenny");
	li.add("kavya");
	
	Iterator itr = li.iterator();
	System.out.println("Array Elements:");
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println();
	System.out.println("After updating array:");
	li.add(2,"chetan");
	
	li.remove("kavya");
	li.remove(3);
	li.set(1, "baanu");
	
	for(String i:li)
	{
		System.out.println(i);
	}
	System.out.println();
	System.out.println("Person at index 4:"+li.get(4));
	System.out.println("Index of faraz:"+li.indexOf("faraz"));
	System.out.println("Size of array:"+li.size());
	System.out.println("Checking whether Harsha is present in the array:"+li.contains("harsha"));
	li.clear();
	
	
	}

}
