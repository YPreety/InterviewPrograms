package test1;

import java.util.*;

public class MyClass27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		s.add("1");
		s.add(1);
		s.add(null);
		s.add("null");
		System.out.print("list : " + s); //list : [null, 1, 1, null]

	}

}
