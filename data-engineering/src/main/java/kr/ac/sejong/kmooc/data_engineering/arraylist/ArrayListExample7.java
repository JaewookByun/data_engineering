package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample7 {
	public static void main(String[] args) {
		List<Integer> l = new MyArrayList<Integer>();
		l.add(0, 3);
		l.add(1, 5);
		l.add(2, 7);
		l.add(1, 9);
		System.out.println(l);

		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));

		//[3, 9, 5, 7]
		//3
		//9
		//5
		//7
		//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
	}
}
