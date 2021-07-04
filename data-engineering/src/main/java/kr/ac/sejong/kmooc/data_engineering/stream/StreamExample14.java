package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample14 {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("a,b,c", "d,e", "f", "g,h");

		List<String> list = s.flatMap(e -> Arrays.stream(e.split(","))).collect(Collectors.toList());
		System.out.println(list);
	}
}
