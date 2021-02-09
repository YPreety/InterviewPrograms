package test1;

public class MyClass37 {

	 static void main(String[] args) {
		// TODO Auto-generated method stub
		 Generic g = new Generic();
		 g.testSub();

	}

}

class Generic<T>{
	public T Field;
	public void testSub(){
		 T i = Field + 1;
	}
}