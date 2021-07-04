package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample11 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);

		List<Integer> list = s.filter(e -> e > 3).collect(Collectors.toList());
		System.out.println(list);
	}
}
