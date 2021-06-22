import java.io.*;
public class Min_Max {

	public static void main(String[] args) {
		int a[]= {8,2,5,3,7,9,4};
		int max=a[0],min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
				min=a[i];
			
	    }
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>max)
				max=a[i];
			
	    }
		
			System.out.println(max);
			System.out.println(min);
			
		
	}

}
