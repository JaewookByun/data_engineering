package kr.ac.sejong.kmooc.data_engineering.hashmap;

import java.util.HashMap;

public class HashMapExample3 {

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
	
	}
}
