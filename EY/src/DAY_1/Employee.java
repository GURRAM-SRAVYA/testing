package DAY_1;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID=1L;
	String name;
	int age;
	double salary;
	Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void showDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}
	

}
