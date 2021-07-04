package kr.ac.sejong.kmooc.data_engineering.lambda;

import java.util.HashMap;

public class LambdaExample6 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(3, 4);
		map.put(5, 6);
//		map.compute(3, new BiFunction<Integer, Integer, Integer>() {
//			@Override
//			public Integer apply(Integer key, Integer value) {
//				System.out.println(key + " -> " + value);
//				return 7;
//			}
//		});
		map.compute(3, (key, value) -> 7);
		System.out.println(map);

	}
}
