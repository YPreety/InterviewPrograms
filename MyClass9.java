package test1;

import java.util.ArrayList;
import java.util.List;

public class MyClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println("list: ");
		l.add(1,"d");
		System.out.println(l); //[a, d, b, c]
		
	}

}
