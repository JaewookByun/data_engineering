package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample30 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);

		// 홀수 짝수 Grouping
		Map<Boolean, List<Integer>> map = s.collect(Collectors.partitioningBy(e -> e % 2 == 1));
		System.out.println(map);

		Map<Integer, List<Integer>> map2 = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.groupingBy(e -> e % 3));
		System.out.println(map2);
	}
}
