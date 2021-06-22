import java.io.*;
import java.util.*;
public class Insert_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter total array numbers");
		int n=sc.nextInt();
		System.out.println("enter array values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be inserted");
		int num=sc.nextInt();
		System.out.println("Enter the position to insert the element");
		int pos=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			while(i==pos)
			{
				a[pos]=num;
			}
		}
		System.out.println("array values");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
