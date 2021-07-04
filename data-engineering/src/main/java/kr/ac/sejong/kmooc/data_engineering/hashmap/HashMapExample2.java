package kr.ac.sejong.kmooc.data_engineering.hashmap;

import java.util.HashMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map);
		map.put(1, 3);
		map.put(2, 4);
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		map.put(1, 5);
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		map.putIfAbsent(3, 6);
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		map.putIfAbsent(2, 1);
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.size());
	}
}
