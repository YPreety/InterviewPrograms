package test1;

import java.util.ArrayList;
import java.util.List;

public class MyClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l = new ArrayList();
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		l.add(list);
		
		System.out.println("list : "+list); //list : [a, b]
	}

}
