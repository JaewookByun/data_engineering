package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		s.map(e -> {
			if (e % 2 == 0)
				return true;
			else
				return false;
		}).forEach(e -> {
			System.out.println(e);
		});
		System.out.println("DONE");
	}

}
