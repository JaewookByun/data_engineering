package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample35 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);

		int size = s.collect(Collectors.collectingAndThen(Collectors.toList(), e -> e.size()));
		System.out.println(size);
	}
}
