package DAY_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import DAY_1.Employee;

public class EmpObjectSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpObjectSerialization imp1=new EmpObjectSerialization();
		imp1.writeData();
		imp1.readData();

	}
	private void writeData() {
		Employee db[]= {
				new Employee("Sravya",20,40000.56),
				new Employee("kavya",21,30000.56),
				new Employee("Ramya",22,20000.56)
		};
		try(FileOutputStream out=new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\EY GDS projects\\EY\\src\\DAY_1.ser");
				ObjectOutputStream sout=new ObjectOutputStream(out);){
			for(int i=0;i<db.length;i++) {
				sout.writeObject(db[i]);
			}
			
		}catch(IOException ioe) {
			ioe.getStackTrace();
		}
	}
	private void readData() {
		try(FileInputStream in=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\EY GDS projects\\EY\\src\\DAY_1.ser");
				ObjectInputStream sin=new ObjectInputStream(in);){
			Employee e=(Employee) sin.readObject();
			e.showDetails();
			e=(Employee) sin.readObject();
			e.showDetails();
			e=(Employee) sin.readObject();
			e.showDetails();
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

}
