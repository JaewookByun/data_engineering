package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;

public class LinkedListExample8 {
	public static void main(String[] args) {
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.offer(7);
		linkedList.offer(9);
		System.out.println(linkedList);
		linkedList.clear();
		System.out.println(linkedList);
	}
}
