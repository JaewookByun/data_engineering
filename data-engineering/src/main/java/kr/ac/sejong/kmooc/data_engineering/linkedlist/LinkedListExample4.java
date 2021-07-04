package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;

public class LinkedListExample4 {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(9);
		System.out.println(linkedList);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(linkedList);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>(linkedList);
		System.out.println(linkedList.contains(5));
		System.out.println(arrayList.contains(5));
		System.out.println(myLinkedList.contains(5));
		System.out.println(linkedList.get(1));
		System.out.println(arrayList.get(1));
		System.out.println(myLinkedList.get(1));
		System.out.println(linkedList.indexOf(5));
		System.out.println(arrayList.indexOf(5));
		System.out.println(myLinkedList.indexOf(5));
		System.out.println(linkedList.lastIndexOf(5));
		System.out.println(arrayList.lastIndexOf(5));
		System.out.println(myLinkedList.lastIndexOf(5));
	}
}
