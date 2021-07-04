package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamExample9 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		// 1,2,3,4,5 --> "12345"
		StringBuilder b = s.collect(new Supplier() {
			@Override
			public Object get() {
				return new StringBuilder();
			}
		}, new BiConsumer<StringBuilder, Integer>() {
			@Override
			public void accept(StringBuilder t, Integer u) {
				t.append(u);
			}
		}, (b1, b2) -> {
		});
		System.out.println(b.toString());
	}
}
