import java.io.*;
import java.util.*;
public class Search_array_element {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
	    int flag=0;
		System.out.println("enter total array numbers");
		int n=sc.nextInt();
		System.out.println("enter array values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element to find");
		int num=sc.nextInt();
		for(int i=0;i<n;i++)
		{
	    if(num==a[i])
	    {
	    	flag++;
	    }
		}
		if(flag==1){
	    	System.out.println("The element "+num+" is present in an array");
	    }	
		
	    else
	    {
	    	System.out.println("The element is not present");
	    }
	

}
}
