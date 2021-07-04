package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;

public class LinkedListExample5 {
	public static void main(String[] args) {

		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(9);
		List<Integer> arrayList = new ArrayList<Integer>(linkedList);
		List<Integer> myLinkedList = new MyLinkedList<Integer>(linkedList);
		System.out.println("TEST STARTS");
		System.out.println(linkedList);
		System.out.println(arrayList);
		System.out.println(myLinkedList);
		linkedList.set(2, 4);
		arrayList.set(2, 4);
		myLinkedList.set(2, 4);
		System.out.println(linkedList);
		System.out.println(arrayList);
		System.out.println(myLinkedList);
		System.out.println(linkedList.remove(Integer.valueOf(4)));
		System.out.println(arrayList.remove(Integer.valueOf(4)));
		System.out.println(myLinkedList.remove(Integer.valueOf(4)));
		System.out.println(linkedList);
		System.out.println(arrayList);
		System.out.println(myLinkedList);
		System.out.println(linkedList.remove(3));
		System.out.println(arrayList.remove(3));
		System.out.println(myLinkedList.remove(3));
		System.out.println(linkedList);
		System.out.println(arrayList);
		System.out.println(myLinkedList);
	}
}
