import java.io.*;
public class Second_Largest {

	public static void main(String[] args) {
		int a[]= {2,6,3,4,9,7,1};
		int len=a.length;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		System.out.print("second largest number:");
			System.out.println(a[len-2]);
		

	}

}
