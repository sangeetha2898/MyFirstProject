import java.io.*;
public class Reverse_array {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	System.out.println("Array elements:");
	for(int i=0;i<a.length-1;i++)
	{
		System.out.print(a[i]);
	}
	System.out.println("\nReverse array elements:");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
	}

}
