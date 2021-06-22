import java.io.*;
public class FileReader_ex {

	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("C:\\file1.txt");
		int i=0;
		while((i=fr.read())!=-1)
				{
			      System.out.println((char)i);
				}
		fr.close();
		System.out.println("Success");

	}

}
