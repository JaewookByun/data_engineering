package kr.ac.sejong.kmooc.data_engineering.hashmap;

import java.util.HashMap;

public class HashMapExample4 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(3, 4);
		map.put(2, 5);
		System.out.println(map);

		HashMap<Email, Integer> map2 = new HashMap<Email, Integer>();

		map2.put(new Email(1, 2), 3);
		map2.put(new Email(2, 4), 5);
		System.out.println(map2);
		map2.put(new Email(1, 2), 7);
		System.out.println(map2);

		HashMap<Integer, Integer> map3 = new HashMap<Integer, Integer>(map);
		System.out.println(map3);

		HashMap<Object, Object> map4 = new HashMap<Object, Object>(map2);
		System.out.println(map4);

		// map2 = new HashMap<Email, Integer>(map4);
		
		
	}
}
