package test1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyClass24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new TreeSet();
		s.add(1);
		s.add("2");
		s.add(3);
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() +" "); // java.lang.ClassCastException:
		}

	}

}
