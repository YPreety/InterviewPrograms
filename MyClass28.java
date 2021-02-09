package test1;

import java.util.*;

public class MyClass28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m = new IdentityHashMap<String,String>();
		m.put(new String("a"), "preety");
		m.put(new String("a"), "dharam");
		System.out.println("list : "+m);//list : {a=preety, a=dharam}

	}

}
