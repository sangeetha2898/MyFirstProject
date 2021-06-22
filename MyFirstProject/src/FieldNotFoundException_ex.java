import java.lang.reflect.*;  
  
public class FieldNotFoundException_ex {  
  
   public static void main(String[] args) {  
	   
	   FieldNotFoundException_ex  obj = new FieldNotFoundException_ex();  
      Class class1 = obj.getClass();  //gets the class  
   
      System.out.println("Field got  =");  
      try {  
          
         Field Flds = class1.getField("str");  
         System.out.println(" field found: " + Flds.toString());  
      } catch(NoSuchFieldException e) {  
         System.out.println(e.toString());  
      }  
   }  
  
   public FieldNotFoundException_ex() {        
   }  
  
   public FieldNotFoundException_ex(String str) {         
      this.str = str;  
   }  
   public String str = "javaTpoint";
     
}   
