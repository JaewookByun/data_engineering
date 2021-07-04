package kr.ac.sejong.kmooc.data_engineering.hashset;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample16 {
	public static void main(String[] args) {
		MyHashSet<Integer> a = new MyHashSet<Integer>();
		a.add(0);
		a.add(1);
		a.add(2);
		MyHashSet<Integer> b = new MyHashSet<Integer>();
		b.add(0);
		b.add(1);
		b.add(2);
		b.add(3);

		System.out.println(a.retainAll(b));
		for (Integer val : a) {
			System.out.println(val);
		}

	}
}
