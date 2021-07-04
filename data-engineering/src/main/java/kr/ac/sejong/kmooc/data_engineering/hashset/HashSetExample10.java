package kr.ac.sejong.kmooc.data_engineering.hashset;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample10 {
	public static void main(String[] args) {
		MyHashSet<Integer> set = new MyHashSet<Integer>(4);
		set.add(0);
		set.add(4);
		set.add(8);
		set.add(1);
		set.add(9);
		set.add(5);
		set.add(2);
		set.add(6);
		set.add(3);
		set.add(7);
		System.out.println(set.contains(2));
		System.out.println(set.remove(2));
		System.out.println(set.contains(2));
		System.out.println(set.remove(50));

	}
}
