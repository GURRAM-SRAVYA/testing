package Mazenet;

import java.util.*;

public class Basket {
	public Basket(long manufactureNo, int qty) {
		super();
		this.manufactureNo = manufactureNo;
		this.qty = qty;
	}
	Basket(){
		
	}
	private long manufactureNo;
	private int qty;
	public long getManufactureNo() {
		return manufactureNo;
	}
	public void setManufactureNo(long manufactureNo) {
		this.manufactureNo = manufactureNo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		return "Manufacture number is"+getManufactureNo()+"with Quantity"+ getQty();
	}
	public int getBasketWithHighestQuantity(ArrayList<Basket> l) {
	  
	  return ( l.stream().mapToInt(Basket::getQty).min().getAsInt());
	 
	}
	public int  getBasketWithLowestQuantity(ArrayList<Basket> l){
		return(l.stream().mapToInt(Basket::getQty).max().getAsInt());
	}
	public int  totalQtyOfAllBaskets(ArrayList<Basket> l) {
		return l.stream().mapToInt(e->e.getQty()).sum();
	}
	public static void main(String[] args) {
		
		 Basket b[]= new Basket[]{new Basket(1234,12),new Basket(3456,45),new Basket(1678,65),new Basket(1537,62),new Basket(7685,42)};
		 List<Basket> b2=Arrays.asList(b);
		 ArrayList<Basket> blist= new ArrayList<Basket>();
		 blist.addAll(b2);
		 
		 Basket b1=new Basket();
		 System.out.println(b1.getBasketWithHighestQuantity(blist));
		 
		 System.out.println(b1.getBasketWithLowestQuantity(blist));
		 System.out.println(b1.totalQtyOfAllBaskets(blist));
         	 
	}
}