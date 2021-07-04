package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample15 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 1, 2, 2, 3, 3);

		List<Integer> list = s.distinct().collect(Collectors.toList());
		System.out.println(list);
	}
}
