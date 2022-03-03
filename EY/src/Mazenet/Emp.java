package Mazenet;



public class Emp extends Person{ int salary;
Emp(int id,String name,int salary)
{
super(id,name); this.salary=salary;
}


public void display() {
System.out.println("ID -- "+ super.getId()+"\nName --- "+super.getName()+"\nSalary --- "+salary);
}
public static void main(String[] args) {
// TODO Auto-generated method stub

Emp e=new Emp(1,"sravya",50000); e.display();

System.out.println();
Emp e1=new Emp(2,"kavya",49000);

e1.display();
}
}

