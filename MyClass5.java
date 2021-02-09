package test1;

import java.util.ArrayList;
import java.util.List;

public class MyClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println("list : "+ sum(list));   //list : 3.0
	}
	
	public static double sum(List<? extends Number> list){
		//list.add(4); // complier error : The method add(int, capture#1-of ? extends Number) in the type List<capture#1-of ? extends Number> is not applicable for the arguments (int)
		double sum =0;
		for(Number num :list){
			sum +=num.doubleValue();
		}
		return sum;
	}

}
