package DAY_1;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteWR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeFileContent("C:\\Users\\Lenovo\\DAY_1\\sra.1");
		writeFileChar("C:\\\\Users\\\\Lenovo\\\\DAY_1\\\\sra.2");

	}
	
	private static void writeFileContent(String fileName) {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(fileName))){
			bw.write("Writing one line");
			bw.newLine();
			bw.write("writing second line");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private static void writeFileChar(String fileName) {
		// TODO Auto-generated method stub
		BufferedOutputStream bs=null;
		try {
			bs=new BufferedOutputStream(new FileOutputStream(fileName));
			bs.write("writing one line".getBytes());
			bs.write("\r\n".getBytes());
			bs.write("writing second line".getBytes());
		}catch(IOException ioExp) {
			
			ioExp.printStackTrace();
		}finally {
			if(bs!=null) {
				try {
					bs.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	

}
