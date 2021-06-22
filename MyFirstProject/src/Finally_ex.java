import java.io.*;
public class Finally_ex {

	public static void main(String[] args) {
	int a[]= {2,3,4,5,6};
	try
	{
		System.out.println("Accessing array elements");
		for(int i=0;i<a.length;i++)
			System.out.println(a[7]);
				
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Finally block executed");
	}

	}

}
