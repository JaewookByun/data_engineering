package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample29 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);

		// 최솟값
		System.out.println(s.collect(Collectors.reducing(Math::min)).get());
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.reducing(Integer.MAX_VALUE, Math::min)));

		Stream<String> s1 = Stream.of("1", "2", "3", "4", "5", "6");
		System.out.println(s1.map(e -> Integer.parseInt(e)).collect(Collectors.reducing(Math::min)));
		System.out.println(Stream.of("1", "2", "3", "4", "5", "6")
				.collect(Collectors
						.reducing(Integer.MAX_VALUE, Integer::parseInt, Math::min)));
	}
}
