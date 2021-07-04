package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample25 {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("Hello", "KMOOC ", "Data", "Engineering");

		s.collect(Collectors.toSet());
		
	}
}
