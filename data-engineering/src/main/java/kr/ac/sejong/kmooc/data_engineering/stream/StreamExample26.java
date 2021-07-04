package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;
import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;
import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;

public class StreamExample26 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 1, 2, 2, 3, 3);

		System.out.println(s.collect(Collectors.toList()));
		System.out.println(Stream.of(1, 1, 2, 2, 3, 3).collect(Collectors.toSet()));
		System.out.println(
				Stream.of(1, 1, 2, 2, 3, 3).collect(Collectors.toCollection(() -> new MyArrayList<Integer>())));
		System.out
				.println(Stream.of(1, 1, 2, 2, 3, 3).collect(Collectors.toCollection(() -> new MyHashSet<Integer>())));
		System.out.println(
				Stream.of(1, 1, 2, 2, 3, 3).collect(Collectors.toCollection(() -> new MyLinkedList<Integer>())));
	}
}
