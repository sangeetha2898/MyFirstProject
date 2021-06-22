import java.io.*;
import java.util.*;
public class Copy_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		System.out.println("enter total array numbers");
		int n=sc.nextInt();
		System.out.println("enter array values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array a elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
			for(int j=0;j<n;j++)
			{
				b[j]=a[j];
			}
			System.out.println("Array b elements after copying");
			for(int i=0;i<n;i++)
			{
				System.out.println(b[i]);
			}
		

	}

}
