package test1;

import java.util.HashMap;

public class MyClass33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Emp5,String> m = new HashMap<Emp5,String>();
		m.put(new Emp5("a"), "emp1");
		m.put(new Emp5("b"), "emp2");
		m.put(new Emp5("a"), "emp1 overridden");
		
		System.out.println("Size : " + m.size()); // 3
		System.out.println("list : " + m.get(new Emp5("a"))); //null
	}
}


class Emp5{
	
	private String name;
	
	public Emp5(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){
		return true;
	}
}