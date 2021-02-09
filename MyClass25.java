package test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyClass25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
			l.add("c");// a followed by ConcurrentModificationException
		}

	}

}
