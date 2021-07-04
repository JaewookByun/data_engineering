package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.util.Comparator;

import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;

public class LinkedListExample7 {
	public static void main(String[] args) {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(3);
		linkedList.add(7);
		linkedList.add(5);
		linkedList.add(9);
		linkedList.add(1);
		System.out.println(linkedList);
		for (Object val : linkedList.toArray()) {
			System.out.println(val);
		}

		linkedList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2)
					return -1;
				else if (o1 == o2)
					return 0;
				else
					return +1;
			}
		});

		System.out.println(linkedList);

		System.out.println(linkedList.subList(1, 3));

		linkedList.clear();

		System.out.println(linkedList);
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.size());
	}
}
