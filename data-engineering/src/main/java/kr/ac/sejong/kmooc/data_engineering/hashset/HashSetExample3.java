package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample3 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			set.add(i);
		}
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		set.clear();
		System.out.println(set);
		for (int i = 0; i < 100; i++) {
			set.add(i);
		}
		System.out.println(set);
		Integer[] array = new Integer[10];
		array = set.toArray(array);
		for (Integer val : array) {
			System.out.println(val);
		}
	}
}
