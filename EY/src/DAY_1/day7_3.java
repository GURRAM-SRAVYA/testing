package DAY_1;

import java.util.Iterator;
import java.util.Stack;

public class day7_3 {
	public static void main(String args[])
	{
		Stack<String> a = new Stack<>();
		a.push("tarun");
		a.push("kavya");
		a.push("Santosh");
		a.push("tejovathi");
		
		a.pop();
		Iterator iterator = a.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
