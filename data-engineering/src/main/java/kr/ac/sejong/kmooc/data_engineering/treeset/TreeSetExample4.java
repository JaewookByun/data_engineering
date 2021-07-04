package kr.ac.sejong.kmooc.data_engineering.treeset;

import java.util.TreeSet;

public class TreeSetExample4 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(9);

		System.out.println(set);
		System.out.println(set.remove(3));
		System.out.println(set);
		System.out.println(set.remove(2));
		System.out.println(set);
		
		System.out.println(set.pollFirst());
		System.out.println(set);
		System.out.println(set.pollLast());
		System.out.println(set);
	}
}
