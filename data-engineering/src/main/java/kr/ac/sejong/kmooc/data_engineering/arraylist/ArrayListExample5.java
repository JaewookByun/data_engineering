package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample5 {
	public static void main(String[] args) {
		List<Integer> l = new MyArrayList<Integer>();
		// []
		l.add(0, 3);
		System.out.println(l);
		l.add(1, 5);
		System.out.println(l);
		l.add(2, 7);
		System.out.println(l);
		l.add(1, 9);
		System.out.println(l);
		
//		[3]
//		[3, 5]
//		[3, 5, 7]
//		[3, 9, 5, 7]
	}
}
