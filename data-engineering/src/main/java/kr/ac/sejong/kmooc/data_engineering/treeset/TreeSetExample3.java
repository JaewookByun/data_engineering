package kr.ac.sejong.kmooc.data_engineering.treeset;

import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(9);

		System.out.println(set);
		System.out.println(set.lower(5));
		System.out.println(set.floor(4));
		System.out.println(set.ceiling(6));
		System.out.println(set.higher(5));
		System.out.println(set.first());
		System.out.println(set.last());
	}
}
