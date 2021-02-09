package test1;

import java.util.*;

public class MyClass26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp3 e1 = new Emp3("preety");
		Emp3 e2 = new Emp3("dharam");

		ArrayList<Emp3> l = new ArrayList<Emp3>();
		l.add(e1);
		l.add(e2);
		Collections.sort(l, new Emp3.ComparatorName());
		;
		System.out.println("list : " + l);  /// list : [name =dharam, name =preety]
	}
}

class Emp3 {
	String name;

	public Emp3() {
	}

	public Emp3(String name) {
		this.name = name;
	}

	public String toString() {
		return "name =" + name;
	}

	static class ComparatorName implements Comparator<Emp3> {
		public int compare(Emp3 o1, Emp3 o2) {
			return o1.name.compareTo(o2.name);
		}
	}
}