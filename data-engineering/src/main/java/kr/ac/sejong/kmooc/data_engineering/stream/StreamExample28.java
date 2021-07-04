package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample28 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);

		// 정수 -> map -> 문자열 -> joining collect
		System.out.println(s.map(e -> String.valueOf(e)).collect(Collectors.joining(",", "[", "]")));

	}
}
