package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.Iterator;
import java.util.ListIterator;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;

public class ArrayListExample14 {
	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ListIterator<Integer> listIterator = list.listIterator(0);
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		ListIterator<Integer> listIterator2 = list.listIterator(list.size());
		while (listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}
	}
}
