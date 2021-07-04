package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;

public class LinkedListExample15 {

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		System.out.println(list);
	}

}
