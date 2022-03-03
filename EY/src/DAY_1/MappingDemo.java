package DAY_1;

import java.util.*;
import java.util.stream.*;


public class MappingDemo {
	public static void main(String[] args) {
		MappingDemo md = new MappingDemo();
		List<Employe> empList = md.createList();
		System.out.println("---Name of Female employees---");
		
		empList.stream().filter(e-> e.getGender()=='F').map(e->e.getFirstname()).forEach(System.out::println);
		int n=empList.stream().filter(e->e.getGender()=='M').mapToInt(e->e.getAge()).sum();
		System.out.println(n);
		
		
		//System.out.println("--- Name of Male employees---");
		empList.stream().filter(e -> (e.getFirstname().startsWith("A")).forEach( System.out::println));
		System.out.println(empList.stream().mapToInt(e->e.getAge().sum()));
	
		
	}

	private static List<Employe> createList() {
		// TODO Auto-generated method stub
		List<Employe> tempList=new ArrayList<Employe>();
		Employe employe=new Employe("Sravya",20,40000,'F');
		tempList.add(employe);
		System.out.println("List elements are"+tempList);
		return tempList;
		
	}
}

