package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample18 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		System.out.println(list);
		
		List<Integer> subList = list.subList(2, 4);
		
		System.out.println(subList);
		
		subList.add(1,9);
		
		System.out.println(subList);
		System.out.println(list);
		
		list.add(10);
		System.out.println(list);
		System.out.println(subList);
	}
}
