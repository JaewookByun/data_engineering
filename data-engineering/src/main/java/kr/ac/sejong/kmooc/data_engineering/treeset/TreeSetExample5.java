package kr.ac.sejong.kmooc.data_engineering.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample5 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(9);
		System.out.println(set);
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		Iterator<Integer> dIter = set.descendingIterator();
		while (dIter.hasNext()) {
			System.out.println(dIter.next());
		}

		TreeSet<Email> emailSet = new TreeSet<Email>(new Comparator<Email>() {

			@Override
			public int compare(Email o1, Email o2) {
				if (o1.to < o2.to)
					return -1;
				else if (o1.to == o2.to)
					return 0;
				else
					return +1;
			}
		});
		emailSet.add(new Email(3, 1));
		emailSet.add(new Email(2, 2));
		emailSet.add(new Email(1, 3));
		System.out.println(emailSet);
	}
}
