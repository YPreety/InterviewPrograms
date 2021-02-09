package test1;

import java.util.HashMap;

public class MyClass34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Emp6,String> m = new HashMap<Emp6,String>();
		m.put(new Emp6("a"), "emp1");
		m.put(new Emp6("b"), "emp2");
		m.put(new Emp6("a"), "emp1 overridden");
		
		System.out.println("Size : " + m.size()); // 3
		System.out.println("list : " + m.get(new Emp6("a"))); //null
	}
}

class Emp6{
	
	private String name;
	
	public Emp6(String name){
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		return (this.name == null ? 0: this.name.hashCode());
	}
}