package Mazenet;

public class Programmer extends Employee { 
    int bonus;
float totalsalary;

Programmer(int bonus,float salary)

{
this.bonus=bonus; this.salary=salary;
}
public void calculate()
{
totalsalary=bonus+salary; System.out.println("The total salary is --"+totalsalary);
}
public static void main(String[] args) {
Programmer p=new Programmer(5000,45000); p.calculate();

Programmer p1=new Programmer(25000,67000);
p1.calculate();

}

}



