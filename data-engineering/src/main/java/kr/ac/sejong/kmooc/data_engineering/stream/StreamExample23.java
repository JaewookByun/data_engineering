package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Stream;

public class StreamExample23 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(2, 5, 9, 3, 6, 1);

		// This means that for all t, accumulator.apply(identity, t) is equal to t.
		Integer min = s.reduce(Integer.MAX_VALUE, Math::min);
		System.out.println(min);

		System.out.println(Stream.of(2, 5, 9, 3, 6, 1).reduce(0, (e1, e2) -> e1 + e2));
		System.out.println(Stream.of(2, 5, 9, 3, 6, 1).reduce(1, (e1, e2) -> e1 * e2));
	}
}
