package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		s.forEach(e -> System.out.println(e));

		s = Stream.of(1, 2, 3, 4, 5);
		s.map(e -> {
			if (e % 2 == 0)
				return true;
			else
				return false;
		});
		System.out.println("DONE");
	}

}
