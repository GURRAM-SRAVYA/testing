package DAY_1;
import java.io.*;
public class File1 {
	public static void main(String[] args) throws IOException {
		FileReader f1=null;
		FileWriter f2=null;
		try {
			f1=new FileReader("C:\\Users\\DELL\\Desktop\\1.txt");
			f2=new FileWriter("C:\\Users\\DELL\\Desktop\\1 (1).txt");
			int s;
			while((s=f1.read())==-1) {
				f2.write(s);
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			if(f1!=null) {
				f1.close();
			}
			if(f2!=null) {
				f2.close();
			}
		}
		
	}

}