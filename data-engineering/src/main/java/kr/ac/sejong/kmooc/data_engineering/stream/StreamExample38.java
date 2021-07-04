package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample38 {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);

		// 4로 나눈 나머지가 1인 instance들과
		// 4로 나눈 나머지가 2인 instance들의
		// teeing 수행

		List<Integer> list = s.collect(Collectors.teeing(Collectors.filtering(e -> e % 4 == 1, Collectors.toList()),
				Collectors.filtering(e -> e % 4 == 2, Collectors.toList()), (List<Integer> l1, List<Integer> l2) -> {
					l1.addAll(l2);
					return l1;
				}));
		System.out.println(list);
	}
}
