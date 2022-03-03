package Mazenet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream a=null;
		FileOutputStream b=null;
		try {
			a=new FileInputStream("C:\\eygds\\sra.txt");
			b=new FileOutputStream("C:\\eygds\\sra1.txt");
			int s;
			while((s=a.read())!=-1) {
				b.write(s);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(a!=null) {
				try {
					a.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(a!=null) {
				try {
					a.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}

	}

	}
}
