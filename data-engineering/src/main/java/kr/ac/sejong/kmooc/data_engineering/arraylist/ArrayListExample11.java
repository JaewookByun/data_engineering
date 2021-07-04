package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample11 {
	public static void main(String[] args) {
		List<Integer> l = new MyArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		System.out.println(l.remove(0));
		System.out.println(l);
		l.add(11);
		System.out.println(l);
		System.out.println(l.remove(1));
		System.out.println(l);
		System.out.println(l.remove(100));
		
		//[3, 5, 7, 9]
		//3
		//[5, 7, 9]
		//[5, 7, 9, 11]
		//	7
		//[5, 9, 11]
		//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 3
	}
}
