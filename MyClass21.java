package test1;

import java.util.*;

public class MyClass21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> n = new ArrayList<Number>();
		n.add(2);
		n.add(3);
		m1(n);
	}

	static void m1(List<? super Double> l){
		System.out.println(l.get(0)); //2 
		System.out.println(l.get(1)); // 3
	}
}
