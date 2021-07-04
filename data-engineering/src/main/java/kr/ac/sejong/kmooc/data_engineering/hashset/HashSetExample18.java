package kr.ac.sejong.kmooc.data_engineering.hashset;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample18 {
	public static void main(String[] args) {
		MyHashSet<Integer> a = new MyHashSet<Integer>();
		a.add(2);
		a.add(5);
		a.add(10);
		a.add(4);
		a.add(20);

		System.out.println(a);

	}
}
