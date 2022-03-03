package DAY_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
public class PropertiesFile {
	private static Properties addProperties(){ 
		Properties props=new Properties();
		props.setProperty("Username", "testuser");
		props.setProperty("password", "sravya123");
		props.setProperty("batchname", "batch-2");
		props.setProperty("new","New");
		return props;
	}
	private static void savePropertyFile(Properties properties, String fileName) {
		//OutputStream propsFile=null;
		try (OutputStream propsFile=new FileOutputStream(fileName)){
			//propsFile=new FileOutputStream(fileName);
			properties.store(propsFile, "Properties File");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	//	finally {
		//	try {
		//		if(propsFile!=null)
			//		propsFile.close();
		//	}catch(IOException e) {
			//	System.out.println(""+e.getMessage());
			//}
		//}
	}
	public static void main(String[] args) {
		final String PROPERTIES_FILE="MyApplication.properties";
		Properties myProps;
		myProps=addProperties();
		savePropertyFile(myProps,PROPERTIES_FILE);
	}
		

	}