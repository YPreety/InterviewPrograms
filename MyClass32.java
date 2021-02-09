package test1;

import java.util.HashMap;

public class MyClass32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Emp4,String> m = new HashMap<Emp4,String>();
		m.put(new Emp4("a"), "emp1");
		m.put(new Emp4("b"), "emp2");
		m.put(new Emp4("a"), "emp1 overridden");
		
		System.out.println("Size : " + m.size()); // 3
		System.out.println("list : " + m.get(new Emp4("a")));  //null
	}
}

class Emp4{
	
	private String name;
	
	public Emp4(String name){
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		return 1;
	}
}
