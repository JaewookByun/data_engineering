package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamExample10 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		// 최대값으로 Reduction
		Optional<Integer> opt = s.reduce(new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				if (t > u)
					return t;
				else
					return u;
			}
		});
		System.out.println(opt.get());
	}
}
