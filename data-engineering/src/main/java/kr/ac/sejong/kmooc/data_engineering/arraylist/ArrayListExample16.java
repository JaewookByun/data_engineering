package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample16 {
	public static void main(String[] args) {
		List<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);

		Object[] array = new Object[3];
		array = list.toArray(array);
		for (Object val : array) {
			System.out.println(val);
		}

	}
}
