package test1;

import java.util.ArrayList;
import java.util.List;

public class MyClass22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n = new ArrayList<Integer>();
		n.add(2);
		m2(n);
	}

	static void m2(List<? super Double> l){
		System.out.println(l.get(0)); //compiler error 
		System.out.println(l.get(1)); 
	}
}
