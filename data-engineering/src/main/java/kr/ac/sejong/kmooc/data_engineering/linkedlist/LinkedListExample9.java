package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.util.NoSuchElementException;

import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;

public class LinkedListExample9 {
	public static void main(String[] args) {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		try {
			System.out.println(linkedList.element());
			System.out.println("출력되지 않음");
		} catch (NoSuchElementException e) {
			System.out.println("출력됨");
		}
		System.out.println(linkedList.peek());

		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		System.out.println(linkedList.element());
		System.out.println(linkedList.peek());

	}
}
