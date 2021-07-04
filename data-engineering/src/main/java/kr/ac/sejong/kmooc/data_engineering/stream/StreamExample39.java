package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.ArrayList;

public class StreamExample39 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			list.add(i);
		}

		list.stream().parallel().sorted().forEach(System.out::println);
	}
}
