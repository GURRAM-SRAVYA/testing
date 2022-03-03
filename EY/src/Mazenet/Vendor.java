package Mazenet;

import java.io.BufferedReader;
import java.io.FileReader;
public class Vendor {
	public static void main(String[]args) {
		try {
			Vendor vr = new Vendor();
        vr.check();
        }catch(Exception e) {
        	e.printStackTrace();
        	}
		}
	private void check()throws Exception{
		BufferedReader bf = new BufferedReader(new FileReader("\"C:\\Users\\Lenovo\\eclipse-workspace\\EY GDS projects\\EY\\src\\Mazenet\\index.java\""));
		String str;
		while((str=bf.readLine()) != null) {
			if(str == "Check") {
				System.out.println("It is valid");
				}
			else {
				System.out.println("It is not valid");
				}
			}
		}
	}