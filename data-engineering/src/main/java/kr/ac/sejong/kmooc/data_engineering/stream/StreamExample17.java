package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample17 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(2, 5, 9, 3, 6, 1);

		HashSet<Integer> set = new HashSet<Integer>();

		List<Integer> list = s.peek(e -> set.add(e)).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(set);
	}
}
