package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.HashSet;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class StreamExample42 {

	public static void main(String[] args) {

		// HashSet으로 collect
		HashSet<Integer> set = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(() -> new HashSet<Integer>(),
				new BiConsumer<HashSet<Integer>, Integer>() {
					@Override
					public void accept(HashSet<Integer> t, Integer u) {
						t.add(u);
					}
				}, new BiConsumer<HashSet<Integer>, HashSet<Integer>>() {

					@Override
					public void accept(HashSet<Integer> t, HashSet<Integer> u) {
						t.addAll(u);
					}
				});
		System.out.println(set);
	}
}
