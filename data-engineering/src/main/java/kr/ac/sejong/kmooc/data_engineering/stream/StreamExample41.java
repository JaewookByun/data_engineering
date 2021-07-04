package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Stream;

public class StreamExample41 {

	public static void main(String[] args) {

		// 전체의 곱
		int result = Stream.of(1, 2, 3, 4, 5).parallel().reduce(1, (e1, e2) -> {
			System.out.println("accumulator " + e1 + " * " + e2 + " = " + (e1 * e2));
			return e1 * e2;
		}, (e1, e2) -> {
			System.out.println("combiner " + e1 + " * " + e2 + " = " + (e1 * e2));
			return e1 * e2;
		});
		System.out.println(result);
	}
}
