
public class garbage_ex 

{
    
     public void finalize()
     {
         System.out.println("object is garbage collected");
     }  
     
     void show()
     {
                  System.out.println("hi");

     }
 public static void main(String args[])
 
 
 {  
  garbage_ex s1=new garbage_ex();  
  garbage_ex s2=new garbage_ex(); 
  garbage_ex s3=new garbage_ex(); 
  
  s1=null;  
  s2=null; 
  s3=null;
  
  System.gc();  
 }  

    
}
