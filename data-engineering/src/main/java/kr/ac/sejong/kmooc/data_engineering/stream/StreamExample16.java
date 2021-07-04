package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample16 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(2, 5, 9, 3, 6, 1);
		List<Integer> list = s.sorted().collect(Collectors.toList());
		System.out.println(list);

		Stream<Email> s1 = Stream.of(new Email(1, 5), new Email(2, 4), new Email(3, 3));
		List<Email> list1 = s1.sorted((o1, o2) -> {
			if (o1.to < o2.to)
				return -1;
			else if (o1.to == o2.to)
				return 0;
			else
				return +1;
		}).collect(Collectors.toList());
		System.out.println(list1);
	}
}
