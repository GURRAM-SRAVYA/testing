package Mazenet;

import java.util.*;
import java.util.Collections;

public class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int age;
    Student(){
    	
    }
    Student(int rollNo,String name,int age){
    	this.rollNo=rollNo;
    	this.name=name;
    	this.age=age;
    	
    }
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
    {
 
        return this.rollNo + " " + this.name + " "+ this.age;
    }
     @Override
	public int compareTo(Student s){
		if(getAge()==s.age)
			return 0;
		else if(getAge()>s.age)
			return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
		Student s1=new Student(1,"Sravya",20);
        Student s2=new Student(2,"Ramya",22);
        Student s3=new Student(3,"Kavya",19);
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(s3);
		studentList.add(s2);
		studentList.add(s1);
		System.out.println("Without Sorting");
	    for(Student s:studentList) {
	    	System.out.println(s);
	    }
	    
	    Collections.sort(studentList);
	    System.out.println("Sorting of age with comparable");
	    for(Student s:studentList) {
	    	System.out.println(s);
	    }
		Collections.sort(studentList,new RollNumberComparator());
		System.out.println("Sorting of roll number with comparator");
		for(Student s:studentList) {
	    	System.out.println(s);
	    }
	}
	
}
	 
	class RollNumberComparator implements Comparator<Student>{
		public int compare(Student a,Student b) {
			return a.rollNo-b.rollNo;
		}
	}