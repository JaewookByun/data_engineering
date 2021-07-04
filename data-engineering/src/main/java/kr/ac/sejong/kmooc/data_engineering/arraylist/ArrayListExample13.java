package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample13 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer val = iterator.next();
			// 짝수일때
			if (val % 2 == 0)
				iterator.remove();
		}
		System.out.println(list);
	}
}
