package test1;

import java.util.Arrays;
import java.util.Comparator;

public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] ar = {"c","d","b","a","e"};
		InnerClass in = new InnerClass();
		Arrays.sort(ar,in);
		for(String str : ar)
			System.out.println("str : " +str + "");  //e d c b a
        System.out.println(Arrays.binarySearch(ar, "b")); // -1
	}
	
	static class InnerClass implements Comparator<String>{
		public int compare(String s1 ,String s2 ){
			return s2.compareTo(s1);
		}
	}
}
