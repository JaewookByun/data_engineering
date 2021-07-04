package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.util.ArrayList;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample1 {

	public static void main(String[] args) {
		MyHashSet<Integer> intHashSet = new MyHashSet<Integer>();
		System.out.println(intHashSet);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(5);
		System.out.println(arrayList);
		MyHashSet<Integer> intHashSet2 = new MyHashSet<Integer>(arrayList);
		System.out.println(intHashSet2);
		
//		[]
//		[1, 3, 3, 5]
//		[1, 3, 5]
	}

}
