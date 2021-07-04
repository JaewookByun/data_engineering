package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample36 {

	public static void main(String[] args) {

		// 3배로 변환 후 List로 Collecting
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.mapping(e -> e * 3, Collectors.toList())));
		// 2배로 증식 후 List로 Collecting
		System.out.println(
				Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.flatMapping(e -> Stream.of(e, e), Collectors.toList())));
		// 홀수만 List로 Collecting
		System.out.println(
				Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.filtering(e -> e % 2 == 1, Collectors.toList())));
	}
}
