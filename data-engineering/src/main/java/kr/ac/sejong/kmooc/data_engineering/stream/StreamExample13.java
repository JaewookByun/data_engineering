package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class StreamExample13 {

	public static void main(String[] args) {
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).sum());
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).min().getAsInt());
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).max().getAsInt());
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).count());
		System.out.println(Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).average().getAsDouble());
		IntSummaryStatistics statistics = Stream.of(1, 2, 3, 4, 5, 6).mapToInt(e -> e).summaryStatistics();
		System.out.println(statistics);
	}
}
