package test1;

import java.util.Map;
import java.util.TreeMap;

public class MyClass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> m = new TreeMap<Integer,String>();
		m.put(11, "audi");
		m.put(null, null);
		m.put(11, "bmw");
		m.put(null, "fer");
		System.out.println("size " + m.size());
		System.out.println(m);// Runtime Exception : Null pointer Exception
	}

}
