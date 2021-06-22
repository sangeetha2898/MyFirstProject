import java.io.*;
import java.util.*;
public class AverageOf_Array_Values {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int sum=0;
		System.out.println("enter 10 array values");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of array values:"+sum);
	}
}
		