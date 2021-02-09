package test1;


import java.util.*;

public class MyClass31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> m = new Hashtable<Integer,String>();
		m.put(11, "preety");
		m.put(null, "dharam");
		m.put(null, null);
		System.out.println("list size : "+m.size());
		System.out.println("list : "+m);//java.lang.NullPointerException
	}

}
