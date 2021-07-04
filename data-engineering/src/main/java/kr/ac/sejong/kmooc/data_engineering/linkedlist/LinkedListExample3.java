package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;

public class LinkedListExample3 {
	public static void main(String[] args) {

		List<Integer> linkedList = new LinkedList<Integer>();
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.size());
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(7);
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.size());

		List<Integer> arrayList = new ArrayList<Integer>(linkedList);
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.size());

		List<Integer> myLinkedList = new MyLinkedList<Integer>(linkedList);

		// 3 - 9 - 5 - 7
		linkedList.add(1, 9);
		// 1번째 이후의 인덱스 요소들을 뒤로 밀고
		// 1번째 인덱스에 9를 삽입
		arrayList.add(1, 9);
		myLinkedList.add(1, 9);
		System.out.println(linkedList);
		System.out.println(arrayList);
		System.out.println(myLinkedList);
	}
}
