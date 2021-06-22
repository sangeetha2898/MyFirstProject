import java.io.*;
import java.util.*;
class Missing_number {
    public static void main(String args[]) {
         int a[]=new int[10];int m=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 10 array elements");	 
       
        for(int i=1;i<10;i++)
        {
           a[i]=sc.nextInt();;
        }
        System.out.println("Array Elements:");
        for(int i=1;i<10;i++)
        {
        	System.out.println(a[i]);
        }
        
      for(int i=0;i<9;i++)
      {
          if(a[i+1]!=(a[i]+1))
          {
              m=a[i]+1;
          }
      }
      System.out.println("Missing Element:"+m);
    }
}