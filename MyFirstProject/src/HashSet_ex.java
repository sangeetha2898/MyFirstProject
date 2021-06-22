import java.io.*;
import java.util.*;
public class HashSet_ex {

	public static void main(String[] args) {
		HashSet <String> hset=new HashSet<String>();
		hset.add("abhi ");
		hset.add("bhavya ");
		hset.add("chethan ");
		hset.add("deeraj");
		hset.add("eshwar ");
		hset.add("faraz ");
		hset.add("gautham ");
		hset.add("hari ");
		hset.add("john ");
		hset.add("kalyan ");
		System.out.println("Hash Set Elements:");
		Iterator itr=hset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Using Clone():"+hset.clone());
		System.out.println("Does HashSet contain Deeraj:"+hset.contains("deeraj"));
		System.out.println("Is HashSet Empty:"+hset.isEmpty());
		System.out.println("Size of HashSet:"+hset.size());
		System.out.println("Removing all the elements from HashSet:"+hset.removeAll(hset));
		System.out.println(hset);
		

	}

}
