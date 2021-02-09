package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("preety","4");
		Employee emp2 = new Employee("dharam" ,"2");
		ArrayList<Employee>list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		Collections.sort(list,new Employee());
		System.out.println("list : " + list); //list : [{name =  preety id = 4}, {name =  dharam id = 2}]
	}
}

class Employee implements Comparator<Employee>{
	String name;
	String id;

	public Employee(){}
	
	public Employee (String name , String id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int compare(Employee obj1 , Employee obj2){
		return obj2.name.compareTo(obj1.name);
	}
	
	@Override
	public String toString (){
		return "{" + "name =  "+name + " id = " +id + "}" ;
	}
}
