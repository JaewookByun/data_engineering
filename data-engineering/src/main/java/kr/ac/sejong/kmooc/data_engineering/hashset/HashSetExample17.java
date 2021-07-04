package kr.ac.sejong.kmooc.data_engineering.hashset;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample17 {
	public static void main(String[] args) {
		MyHashSet<Integer> a = new MyHashSet<Integer>();
		a.add(2);
		a.add(5);
		a.add(10);
		a.add(4);
		a.add(20);

		MyHashSet<Integer> b = new MyHashSet<Integer>();

		b.add(3);
		b.add(6);
		b.add(15);
		b.add(30);

		System.out.println(a.removeAll(b));
		for (Integer val : a) {
			System.out.println(val);
		}

	}
}
