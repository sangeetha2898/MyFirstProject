import java.io.*;
public class Duplicate_Element {

	public static void main(String[] args) {
		int a[]= {4,7,6,2,3,1,9,3};
		
		
		for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                {
                	System.out.print("Duplicate Element:");
                    System.out.println(a[j]);  
                }
}
	}
	}
}

