package test1;

import java.util.*;

public class MyClass17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Collection<Integer> c = new HashSet<Integer>();
        c.add(3);
        c.add(1);
        c.add(2);
        
        Set<Integer> s = new TreeSet<Integer>(c);
        System.out.println("tree set : " + s); //tree set : [1, 2, 3]
	}
}
