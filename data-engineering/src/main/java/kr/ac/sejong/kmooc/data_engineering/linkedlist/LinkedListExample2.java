package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class LinkedListExample2 {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(3);
		arrayList.add(7);
		arrayList.add(5);
		System.out.println(arrayList);

		LinkedList<Integer> intList = new LinkedList<Integer>(arrayList);
		LinkedList<String> stringList = new LinkedList<String>();
		LinkedList<Email> emailList = new LinkedList<Email>();

		System.out.println(intList);
		System.out.println(stringList);
		System.out.println(emailList);

		MyLinkedList<Integer> intList2 = new MyLinkedList<Integer>(arrayList);
		System.out.println(intList2);
	}
}
