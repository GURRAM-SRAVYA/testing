package Mazenet;
import java.util.*;
public class HashSetElements {
	public static void main(String[] args)	{
	Set<Integer> s=new HashSet<>();	
	s.add(1);	
	s.add(2);	
	s.add(3);	
	s.add(4);	
	s.add(5);	
	s.add(1);	
		
	Iterator ite =s.iterator();	
	while(ite.hasNext()) {	
	System.out.println(ite.next());	
	}
	}
	}	
		

