package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample3 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		s.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

	}

}
