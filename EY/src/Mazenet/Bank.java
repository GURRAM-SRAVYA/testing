package Mazenet;



public class Bank   {
   
private double amount;
public double roi=0;

Bank(double amount){
	this.amount=amount;
}
Bank(){
	
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public double getRateOfInterset() {
	return roi;
}

public void setRateOfInterset() {
	this.roi = amount/100;
}
public void displayRateOfInterset()
{
	System.out.println("The rate of interest of the bank is"+getRateOfInterset());
}
public static void main(String[] args) {
	Bank b=new Bank(1000.2);

	b.setRateOfInterset();
	b.displayRateOfInterset();
			
	SBI s=new SBI(1000.2);
	s.setRateOfInterset();
	s.displayRateOfInterset();
		
	ICIC i=new ICIC(1000.2);
	i.setRateOfInterset();
	i.displayRateOfInterset();
	
    Axis a=new Axis(1000.2);
	a.setRateOfInterset();
	a.displayRateOfInterset();
		
		
}
}

class SBI extends Bank{
	
	SBI(double amount){
		super(amount);
		
	}
	@Override
	public void setRateOfInterset() {
		roi = (getAmount()*2)/100;
	}
}

class ICIC extends Bank{
	
	ICIC(double amount){
		super(amount);
		
	}
	@Override
	public void setRateOfInterset() {
		roi = (getAmount()*4)/100;
	}
}
class Axis extends Bank{
	
	Axis(double amount){
		super(amount);
		
	}
	@Override
	public void setRateOfInterset() {
		roi = (getAmount()*6)/100;
	}
	
}
