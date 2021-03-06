package DAY_1;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList=Arrays.asList(4,5,6,7,12,16,4,5,4);
		System.out.println("--------Original list------");
		System.out.println(myList);
		
		List<Integer> newList =myList.stream().distinct().collect(Collectors.toList());
		System.out.println("Processed list");
		System.out.println(newList);
		Optional<Integer> opt=myList.stream().min(Integer::compare);
		if(opt.isPresent())
			System.out.println("Minimum element "+opt.get());
		//count method
		long count =myList.stream().count();
		System.out.println("Total no.of elements in list "+count);
		//reduce method
		Optional<Integer> value=myList.stream().reduce((a,b)-> a+b);
		if(value.isPresent())
			System.out.println("Sum is "+value.get());
		List<Integer> dupList=Arrays.asList(4,5,2,8,9);
		//distinct method
		dupList.stream().distinct().forEach(System.out::println);

	}

}
