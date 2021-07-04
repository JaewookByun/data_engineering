package kr.ac.sejong.kmooc.data_engineering.hashmap;

import java.util.HashMap;

public class HashMapExample5 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(100000,0.00001f);
		for (int i = 0; i < 1000; i++) {
			map.put(i, i);
		}
		System.out.println(map);
	}
}
