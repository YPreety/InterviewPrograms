package test1;

import java.util.*;

public class MyClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(11, "a");
		hashmap.put(null, "c");
		hashmap.put(null, null);
		System.out.println("size :"+ hashmap.size()); //2
		System.out.println("hashmap : " + hashmap); //{null=null, 11=a}

	}

}
