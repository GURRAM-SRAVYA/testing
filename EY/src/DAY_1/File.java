package DAY_1;
import java.io.*;
public class File {
     public static void main(String[] args) throws IOException {
    	 FileInputStream f1=null;
    	 FileOutputStream f2=null;
    	 try {
    	  f1=new FileInputStream("C:\\Users\\Lenovo\\Downloads\\0");
    	  f2=new FileOutputStream("C:\\Users\\Lenovo\\Downloads\\0");
    	  int b;
    	  while((b=f1.read())==-1) {
    		  f2.write(b);
    	  }
    	 }
    	 catch(IOException e){
    		 e.printStackTrace();
    	 }
    	 finally {
    		 if (f1!=null) {
    			 f1.close();
    		 }
    		 if(f2!=null) {
    			 f2.close();
    		 }
    	 }
     }
}
