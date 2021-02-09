package test1;

import java.util.*;

public class MyClass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp("preety","4");
		Emp e2 = new Emp("dharam","2");
		ArrayList <Emp> l = new ArrayList<Emp>();
		l.add(e1);
		l.add(e2);
		Collections.sort(l);
		System.out.println("list : "+ l); //list : [{ name : dharam, id  :2}, { name : preety, id  :4}]
	}
}

class Emp implements Comparable<Emp>{
	String name;
	String id;
	public Emp(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	@Override 
	public int compareTo(Emp e3){
		return this.name.compareTo(e3.name);
	}
	@Override
	public String toString(){
		return "{ name : "+ name+ ", id  :" + id+"}";
	}
	
}
