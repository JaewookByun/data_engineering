package kr.ac.sejong.kmooc.data_engineering.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Creation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// instance 들을 통해 만들기
		Stream<Integer> s1 = Stream.of(1,2,3,4);
		
		// array를 통해 만들기
		String[] str = new String[3];
		str[0] = "a";
		str[1] = "b";
		str[2] = "c";
		Stream<String> s2 = Arrays.stream(str);
				
		// Collection을 통해 만들기
		List<Integer> list = List.of(1,2,3,4);
		new ArrayList<Integer>(list).stream();
		new LinkedList<Integer>(list).stream();
		new HashSet<Integer>(list).stream();
		new TreeSet<Integer>(list).stream();
		
		Map<String, String> map = Map.of("Jack", "Data Engineering");
		new HashMap<String, String>(map).entrySet().stream();
		new HashMap<String, String>(map).keySet().stream();
		new HashMap<String, String>(map).values().stream();
	}

}
