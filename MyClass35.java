package test1;

import java.util.PriorityQueue;

public class MyClass35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(1);
		p.add(2);
		p.add(3);
		System.out.println(p.poll()); //1
		System.out.println(p.offer(4)); //true
		p.add(1);
		p.remove(2);
		System.out.println(p.peek());//1
		System.out.println(p);//[1, 3, 4]
	}

}
