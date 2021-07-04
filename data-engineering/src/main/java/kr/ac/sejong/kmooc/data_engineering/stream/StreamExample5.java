package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.function.Function;
import java.util.stream.Stream;

public class StreamExample5 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		s.map(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t + 3;
			}
		}).forEach(e -> System.out.println(e));

	}
}
