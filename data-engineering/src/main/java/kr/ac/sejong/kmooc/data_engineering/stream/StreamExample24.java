package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample24 {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("Hello", "KMOOC ", "Data", "Engineering");

		// ArrayList<String>
		ArrayList<String> list = s.collect(() -> new ArrayList<String>(), (container, e) -> container.add(e),
				(c1, c2) -> {
				});

		System.out.println(list);
	}
}
