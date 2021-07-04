package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamExample40 {

	public static void main(String[] args) {

		// 3억개의 Integer
		// e % 10 != 0을 필터링 (10% 필터링)
		// e % 10 으로 Grouping하여 SummingInt 수행
		// stream vs. parallel stream
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 300000000; i++) {
			list.add(i);
		}
		long pre = System.currentTimeMillis();
		System.out.println(list.stream().parallel().filter(e -> e % 10 != 0)
				.collect(Collectors.groupingBy(e -> e % 10, Collectors.summingInt(e -> e))));
		System.out.println(System.currentTimeMillis() - pre);

		// stream - 5589
		// parallel stream - 1611
	}
}
