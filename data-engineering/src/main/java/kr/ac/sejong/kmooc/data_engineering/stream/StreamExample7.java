package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample7 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(3, 2, 5, 4, 1);

		s.sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2)
					return -1;
				else if (o1 == o2)
					return 0;
				else
					return +1;
			}
		}).forEach(System.out::println);
	}
}
