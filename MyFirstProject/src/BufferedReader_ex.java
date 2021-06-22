import java.io.*;
public class BufferedReader_ex {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("C:\\file1.txt");
		BufferedReader br=new BufferedReader(fr);
		int i=0;
		while((i=br.read())!=-1)
		{
			System.out.println((char)i);
		}
		br.close();
		fr.close();

	}

}
