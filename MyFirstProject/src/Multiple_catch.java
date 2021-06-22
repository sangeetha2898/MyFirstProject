import java.io.*;
import java.util.*;
public class Multiple_catch {

	
		int a=10,b=0;
		int arr[]= {10,20,30,40,50};
		public void disp()
		{
		try
		{
			
				int c=a/b;
				System.out.println(c);
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[7]);
				}
				
			}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(IndexOutOfBoundsException ind)
		{
			System.out.println(ind);
		}
		}
		public static void main(String[] args) {
			Multiple_catch obj=new Multiple_catch();
			obj.disp();
		

	}

}
