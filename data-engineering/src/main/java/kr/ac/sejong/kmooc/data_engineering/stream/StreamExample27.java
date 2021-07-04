package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample27 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4);

		System.out.println(s.collect(Collectors.summingInt(e -> e)));
		System.out.println(Stream.of(1, 2, 3, 4).collect(Collectors.averagingInt(e -> e)));
		System.out.println(Stream.of(1, 2, 3, 4).collect(Collectors.summarizingInt(e -> e)));
		System.out.println(Stream.of(1, 2, 3, 4).collect(Collectors.minBy((e1, e2) -> {
			if (e1 < e2)
				return -1;
			else if (e1 == e2)
				return 0;
			else
				return -1;
		})).get());
		System.out.println(Stream.of(1, 2, 3, 4).collect(Collectors.maxBy((e1, e2) -> {
			if (e1 < e2)
				return -1;
			else if (e1 == e2)
				return 0;
			else
				return -1;
		})).get());
		System.out.println(Stream.of(1, 2, 3, 4).collect(Collectors.counting()));
	}
}
