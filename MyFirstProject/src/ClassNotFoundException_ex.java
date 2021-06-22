public class ClassNotFoundException_ex {
      
    public static void main(String args[]) {
        try 
        {
            Class.forName("Array_ex");
            System.out.println("class found");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
    }
}