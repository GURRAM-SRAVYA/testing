 package Mazenet;

 public class School {
	String s="Oxford public school";	
	class Student{	
	public void display() {	
	System.out.println("the school	name is "+s);
	}	
	}	
	public static void main(String[] args)	{
	School.Student s1=new School().new	Student();
	s1.display();	
	School.Student s2=new School().new	Student();
	s2.display();	
	School.Student s3=new School().new	Student();
	s3.display();	
		
	}	
 }		
		

