package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample4 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		s.filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if (t % 2 == 0) // 짝수라면
					return true;
				else
					return false;
			}
		}).forEach(e -> System.out.println(e));

	}

}
