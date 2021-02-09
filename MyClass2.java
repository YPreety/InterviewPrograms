package test1;

import java.util.LinkedHashSet;
import java.util.Set;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new LinkedHashSet();
		s.add("1");
		s.add(1);
		s.add(3);
		s.add(2);
		System.out.println(s); //1, 1 ,3, 2

	}

}
