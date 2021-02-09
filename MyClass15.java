package test1;

import java.util.HashMap;

public class MyClass15 {

	public static void main(String...a) {
		// TODO Auto-generated method stub
		HashMap<Emp2 , String> hm = new HashMap<Emp2 , String>();
		hm.put(new Emp2("a"), "preety");
		hm.put(new Emp2("b"), "dharam");
		hm.put(new Emp2("a"), "preety overridden");
		
		System.out.println(hm.size()); // 3
		System.out.println(hm.get(new Emp2("a"))); // null
	}
}

class Emp2{
	private String name;
	public Emp2(String name){
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		return (this.name == null ? 0: this.name.hashCode());
	}
}