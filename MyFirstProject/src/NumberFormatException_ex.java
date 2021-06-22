
public class NumberFormatException_ex {

	public static void main(String[] args) {
		try
		{
		int num=Integer.parseInt("xyz");
		System.out.println(num);
	}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}
