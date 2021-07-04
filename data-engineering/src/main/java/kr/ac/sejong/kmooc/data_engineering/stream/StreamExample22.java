package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Stream;

public class StreamExample22 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(2, 5, 9, 3, 6, 1);
		Object[] arr = s.toArray();
		for (Object val : arr)
			System.out.println(val);

		s = Stream.of(2, 5, 9, 3, 6, 1);
		Integer[] arr2 = s.toArray(Integer[]::new);
		for (Integer val : arr2)
			System.out.println(val);

		s = Stream.of(2, 5, 9, 3, 6, 1);
		s.forEach(System.out::println);
	}
}
