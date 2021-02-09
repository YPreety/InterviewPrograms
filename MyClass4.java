package test1;

import java.util.*;

public class MyClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		m(list);
	}
	
	/*public static void m(List<Number> list){ // compile time error
		System.out.println("list : " +list);
	}*/

	public static void m (List<Integer> list){ 
		System.out.println("list : " +list); //list : [2, 3]
	}
}
