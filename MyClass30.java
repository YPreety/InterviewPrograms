package test1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyClass30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(11, "preety");
		Collections.unmodifiableMap(m);
		m.put(12, "dharam");
		System.out.println("list : "+m);//list : {11=preety, 12=dharam}

	}

}
