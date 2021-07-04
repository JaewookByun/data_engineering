package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample15 {
	public static void main(String[] args) {
		List<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());

		// [1, 2, 3, 4, 5]
		// []
		// true
		// 0
	}
}
