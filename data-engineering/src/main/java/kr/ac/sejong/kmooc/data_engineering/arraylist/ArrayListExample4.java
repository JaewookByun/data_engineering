package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample4 {
	public static void main(String[] args) {
		List<Integer> intList = new MyArrayList<Integer>();
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());

		System.out.println(intList.add(3));
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		System.out.println(intList.add(7));
		System.out.println(intList.add(5));
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
//		true
//		0
//		true
//		false
//		1
//		true
//		true
//		false
//		3
	}
}
