import java.io.*;
public class Throw_ex {
	public void age(int a)  throws Exception
	{
		if(a<45)
		{
			throw new Exception("not applicable for vaccination");
		}
	}

	public static void main(String[] args) throws Exception{
		Throw_ex ob=new Throw_ex();
		ob.age(19);
		

	}

}
