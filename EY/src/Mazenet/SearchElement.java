package Mazenet;
import java.util.*;
public class SearchElement {
	public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	Iterator ite=l.iterator();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int i=0;
	while(ite.hasNext()) {
	if((int)ite.next()==a) {
	i=l.indexOf(ite.next())-1; 
		}

	}
	if(i!=0) {
		System.out.println("Element found at index "+i); 
		}
	else {
	System.out.println("Element not found in the ArrayList");
		}
	sc.close();
	}
	}