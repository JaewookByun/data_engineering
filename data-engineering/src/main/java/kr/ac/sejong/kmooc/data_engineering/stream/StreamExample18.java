package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample18 {

	public static void main(String[] args) {

		System.out.println(Stream.of(2, 5, 9, 3, 6, 1).limit(2).collect(Collectors.toList()));
		System.out.println(Stream.of(2, 5, 9, 3, 6, 1).skip(2).collect(Collectors.toList()));
	}
}
