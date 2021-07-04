package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.util.Iterator;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample12 {
	public static void main(String[] args) {
		MyHashSet<Integer> set = new MyHashSet<Integer>(4);
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(8);
		set.add(9);
		set.add(5);
		set.add(6);
		set.add(3);
		set.add(7);

		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		set.clear();
		
		iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
