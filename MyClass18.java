package test1;

import java.util.*;

public class MyClass18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1 , Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});

		m.put(4,1);
		m.put(2,1);
		m.put(3,1);
        System.out.println("tree set : "+ m);  //tree set : {4=1, 3=1, 2=1}
	}

}
