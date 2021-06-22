import java.io.*;
public class Diff_of_Largest_Smallest {

	public static void main(String[] args) {
		int a[]= {2,5,4,7,9,8};
		int temp=0;
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
        int lar=a[len-1];
        int small=a[0];
        System.out.println("Difference of largest and smallest number:"+(lar-small));
        }

}
