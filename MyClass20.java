package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MyClass20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		m.put(4, 1);
		m.put(2, 6);
		m.put(5, 1);

		Set<Entry<Integer, Integer>> s = m.entrySet();
		List<Entry<Integer, Integer>> l = new ArrayList<Entry<Integer, Integer>>(s);
		Collections.sort(l, new Sort1());
		for (Map.Entry<Integer, Integer> e : l) {
			System.out.print(e.getKey()); // 542
		}
	}
}

class Sort1 implements Comparator<Map.Entry<Integer, Integer>> {
	@Override
	public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
		// TODO Auto-generated method stub
		return (e2.getKey()).compareTo(e1.getKey());
	}
}
