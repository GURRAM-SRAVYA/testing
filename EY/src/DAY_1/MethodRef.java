package DAY_1;

import java.util.Arrays;

interface IMyStringFun<T, R>{
	R StringFun(T t);
	
}

public class MethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strNames=new String[] {"Sravya","ramya","Kavya","bhavya"};
		IMyStringFun<String[],String[]> stringFunc=SortClass::sortName;
		String[] sortedNames=stringFunc.StringFun(strNames);
		for(String name:sortedNames) {
			System.out.println(name);
		}

	}

}
class SortClass{
	static String[] sortName(String[] names) {
		Arrays.sort(names);
		return names;
	}
}