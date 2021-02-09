package test1;

import java.util.*;

public class MyClass16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new TreeSet<Integer>(new Comparator<Integer>(){
			public int compareTo(Integer o1 , Integer o2){
				return o2.compareTo(o1);
			}
		});
		s.add(3);
		s.add(1);
		s.add(2);
        System.out.println("tree set : "+ s);  // compile time exception
	}
}
