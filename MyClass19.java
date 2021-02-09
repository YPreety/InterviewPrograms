package test1;

import java.util.*;
import java.util.Map.Entry;

public class MyClass19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 2);
		m.put(2, 1);
		m.put(4, 8);
		
		Set<Entry<Integer , Integer>> s = m.entrySet();
		List<Entry<Integer , Integer>> l = new ArrayList<Entry<Integer , Integer>>(s);
		Collections.sort(l,new Sort());
		for(Map.Entry<Integer , Integer> e :l){
			System.out.print(e.getKey()); //412
		}
	}
}

class Sort implements Comparator<Map.Entry<Integer , Integer>>{
	@Override
	public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
		// TODO Auto-generated method stub
		return(e2.getValue()).compareTo(e1.getValue());
	}
}
