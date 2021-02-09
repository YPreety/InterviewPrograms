package test1;

public class MyClass36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new b();
		System.out.println("x= " + b.getResult(0,1));

	}

}

class A{
	final public int getResult(int a , int b){
		return 0;
	}
}

class B extends A{
	public int getResult(int a , int b){
		return 1;
	}
}