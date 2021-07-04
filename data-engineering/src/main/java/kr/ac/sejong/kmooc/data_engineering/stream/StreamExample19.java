package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample19 {

	public static void main(String[] args) {
		System.out.println(Stream.of(2, 5, 9, 3, 6, 1).takeWhile(e -> e < 6).collect(Collectors.toList()));
		System.out.println(Stream.of(2, 5, 9, 3, 6, 1).dropWhile(e -> e < 6).collect(Collectors.toList()));
	}
}
