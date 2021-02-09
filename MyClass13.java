package test1;

public class MyClass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc o = new Abc();
		Integer i[] ={1,2};
		o.display(i);
		Double d[] = {1.1 , 2.2};
		o.display(d);
	}
}

class Abc{
	<t> void display(t obj[]){
		for(t i :obj){
			System.out.println("i : "+ i + " ");
		}
	}
}

/*i : 1 
i : 2 
i : 1.1 
i : 2.2 */
