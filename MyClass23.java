package test1;

import java.util.Arrays;
import java.util.Comparator;

public class MyClass23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intArray[] = { 2, 3, 1 };
		Arrays.sort(intArray, new Sort2());
		for (int i : intArray) {
			System.out.print(i + " ");//3 2 1
		}
	}
}

class Sort2 implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
}
