package  Mazenet;

	public  class  Car  {
	String  car;
	Wheel  w1;
	Wheel  w2;
	Wheel  w3;
	Wheel  w4;
	Car(){

	}

	Car(String  car,Wheel  w1,Wheel  w2,Wheel  w3,Wheel  w4){
	this.car=car;
	this.w1=w1;
	this.w2=w2;
	this.w3=w3;
	this.w4=w4; 
	}

	public  String  getCar()  {
	return  car; }

	public  void  setCar(String  car)  {
	this.car  =  car; 	}

	public  Wheel  getW1()  {
	return  w1; 	}

	public  void  setW1(Wheel  w1)  {
	this.w1  =  w1; 	}

	public  Wheel  getW2()  {
	return  w2; 	}

	public  void  setW2(Wheel  w2)  {
	this.w2  =  w2; 	}

	public  Wheel  getW3()  {
	return  w3; 	}

	public  void  setW3(Wheel  w3)  {
	this.w3  =  w3; 	}

	public  Wheel  getW4()  {
	return  w4; 	}

 

	public  void  setW4(Wheel  w4)  {	
	this.w4  =  w4;	
	}	
	public  void  display()  {	
	System.out.println("the  name  of  the  car  is  "+getCar());	
	System.out.println("name  of  the  first  wheel  is  "+getW1().getWheel());	
	System.out.println("name  of  the  second  wheel  is  "+getW2().getWheel());	
	System.out.println("name  of  the  third  wheel  is  "+getW3().getWheel());	
	System.out.println("name  of  the  fourth  wheel  is  "+getW4().getWheel());	
	}	
		
	class  Wheel{	
	String  w;	
	Wheel(String  w){	
	this.w=w;	
	}	
	public  void  setWheel(String  w)  {	
	this.w  =  w;	
	}	
		
	public  String  getWheel()  {	
	return  w;	
	}	
		
	}	
		
	public  static  void  main(String[]  args)  {	
	Car  c1=new  Car("Maruti",new  Car().new  Wheel("MRF"),new  Car().new  Wheel("MRF"),new	Car
().new  Wheel("MRF"),new  Car().new  Wheel("MRF"));
		c1.display();
	}	
		
 }

