public class CommentLines {
    /* this is a documentation comment
     * we should use javadoc too in the command prompt
     * javadoc class_name.java 
     */
	public static void main(String[] args) {
		CommentLines obj=new CommentLines();
		System.out.println("Addition:"+obj.add(2,3));
		System.out.println("Subtraction:"+obj.sub(5, 4));

	}
    int add(int a, int b)// adds two numbers and returns the value
    {
    	return (a+b);
    	
    }
    int sub(int a, int b)// subtracts two numbers and returns the value
    {
    	return (a-b);
    	
    }
}
