import java.io.*;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter 10 array values");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array values:");
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
