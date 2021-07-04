package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.Iterator;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample12 {
	public static void main(String[] args) {
		List<Integer> list = new MyArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (Integer val : list) {
			System.out.println(val);
		}
	}
}
