package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample33 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 1);

		// 등장 횟수
		System.out.println(s.collect(Collectors.toMap(e -> e, e -> 1, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer v1, Integer v2) {
				return v1 + v2;
			}
		})));

		// 홀수의 합, 짝수의 합
		System.out.println(
				Stream.of(1, 2, 3, 4, 5, 6)
				.collect(Collectors.toMap(e -> e % 2 == 1, e -> e, (v1, v2) -> v1 + v2)));
	}
}
