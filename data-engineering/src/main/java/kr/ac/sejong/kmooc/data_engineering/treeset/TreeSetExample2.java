package kr.ac.sejong.kmooc.data_engineering.treeset;

import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());

		set.add(3);
		set.add(5);
		set.add(1);

		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.contains(3));
		System.out.println(set.contains(4));

		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());

		TreeSet<Email> emailTreeSet = new TreeSet<Email>();
		emailTreeSet.add(new Email(3, 5));
		emailTreeSet.add(new Email(2, 4));
		emailTreeSet.add(new Email(1, 3));
		System.out.println(emailTreeSet);
	}
}
