import java.util.*;
public class No_of_evenOdd {

	public static void main(String[] args) {
		int a[]= {6,9,5,1,8,4,2,3,22,56};
        int even=0,odd=0;
        for(int i=0;i<a.length;i++) {
        	if(a[i]%2==0)
        	{
        		even++;
        	}
        	else if(a[i]%2!=0)
        	{
        		odd++;
        	}
        }
	    System.out.println("no of even number:"+even);
	    System.out.println("no of odd number:"+odd);
	    
	}

}
