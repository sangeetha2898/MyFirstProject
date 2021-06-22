import java.io.*;
class Search_2Elements {
 
    private static boolean check(int[] arr, int toCheckValue1, int toCheckValue2)
    {
        
        boolean val1 = false;
        boolean val2 = false;
        for (int element : arr) {
            if (element == toCheckValue1) val1 = true; else if(element == toCheckValue2) {
                val2=  true;
                
            }
        }
 
       
        
return val1 && val2;
    }
 
    public static void main(String[] args)
    {
 
    	Search_2Elements obj=new Search_2Elements();
        int arr[] = {5,12,14,67,23,10};
 
        
        int toCheckValue1 = 12; int toCheckValue2=23;
 
  
        System.out.println("Array:");
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);
        }
                        
 
        
        System.out.println("Is " + toCheckValue1 +" and " + toCheckValue2 
                + " present in the array: "+obj.check(arr, toCheckValue1, toCheckValue2));
    }
}