package DAY_1;


import java.io.*;
import java.util.*;

public class Employe {
	String name;
	int age;
	double salary;
	char gender;
	Employe(String name,int age,double salary,char gender){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.gender=gender;
		
	}
	
		public void showDeatails() {
			System.out.println("Name "+name);
			System.out.println("Age "+age);
			System.out.println("Salary "+salary);
	
	}
		public static void main(String[] args) {
			
			 Employe db[]= new Employe[]{new Employe("Sravya",21,1234.21,'F'),new Employe("Tharun",23,1754.212,'M'),new Employe("Sandeep",22,32674.1,'M')};
		     List<Employe> l = (Arrays.asList(db));
				double a=l.stream()
				.filter(e->e.gender=='M')
				.mapToDouble(e->e.salary).sum();
				
				System.out.println(a);
			}

		
		     
		     
}