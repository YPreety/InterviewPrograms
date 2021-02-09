package test1;

import java.util.*;

public class MyClass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		System.out.println(sum(l));  // 5.0
	}

	public static double sum(List<? extends Number> l){
		double sum = 0;
		for(Number num : l){
			sum += num.doubleValue();
		}
		return sum;
	}
}
