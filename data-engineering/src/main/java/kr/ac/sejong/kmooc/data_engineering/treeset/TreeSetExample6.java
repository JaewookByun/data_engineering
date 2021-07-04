package kr.ac.sejong.kmooc.data_engineering.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample6 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(9);
		set.add(11);
		set.add(13);

		for (Integer val : set) {
			System.out.println(val);
		}

		Iterator<Integer> dIter = set.descendingIterator();
		while (dIter.hasNext()) {
			System.out.println(dIter.next());
		}

		for (Integer val : set.descendingSet()) {
			System.out.println(val);
		}

		System.out.println(set.subSet(3, false, 11, false));
	}
}
