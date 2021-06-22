import java.io.*;
public class FileWriter_ex {

	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("C:\\file1.txt");
		fw.write("writing data into file using file writer");
		fw.close();
		System.out.println("Success");
				

	}

}
