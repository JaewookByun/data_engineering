package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.function.IntFunction;
import java.util.stream.Stream;

public class StreamExample6 {

	public static void main(String[] args) {
		Stream<Double> s = Stream.of(1d, 2d, 3d, 4d, 5d);

		for (double v : s.toArray(new IntFunction<Double[]>() {
			@Override
			public Double[] apply(int value) {
				return new Double[value];
			}
		})) {
			System.out.println(v);
		}

		s = Stream.of(1d, 2d, 3d, 4d, 5d);
		for (double v : s.toArray(Double[]::new)) {
			System.out.println(v);
		}

		s = Stream.of(1d, 2d, 3d, 4d, 5d);
		s.forEach(System.out::println);
	}
}
