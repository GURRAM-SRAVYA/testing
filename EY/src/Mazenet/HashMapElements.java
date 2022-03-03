	package Mazenet;
	import java.util.*;
	public class HashMapElements {
	public static void main(String[] args) {
		Map<String,Integer> h=new HashMap<>();		
		h.put("Sravya", 1);		
		h.put("Kavya", 2);		
		h.put("Bhavya", 3);		
		h.put("Ramya", 4);		
		h.put("Avinash", 3);		
		for(Map.Entry<String,Integer> entry:h.entrySet())	{	
		System.out.println("Key : "+entry.getKey()+"	Value	"+entry.getValue());				
		}		
	}	
	}
