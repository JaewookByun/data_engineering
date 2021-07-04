package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamExample8 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		// Stream<Integer> -> IntStream
		int sum = s.mapToInt(new ToIntFunction<Integer>() {
			@Override
			public int applyAsInt(Integer value) {
				return value;
			}
		}).sum();
		System.out.println(sum);
	}
}
