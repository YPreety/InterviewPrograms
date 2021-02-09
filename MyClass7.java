package test1;

import java.util.Iterator;
import java.util.Vector;

public class MyClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("1");
		v.add("2");
		
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()){
			v.add("3");
			System.out.println("list : " + itr.next());  //java.util.ConcurrentModificationException
		}
	}

}
