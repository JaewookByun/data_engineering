package kr.ac.sejong.kmooc.data_engineering.lambda;

import java.util.HashMap;

public class LambdaExample5 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(3, 4);
		map.put(5, 6);
//		map.forEach(new BiConsumer<Integer, Integer>() {
//			@Override
//			public void accept(Integer t, Integer u) {
//				System.out.println(t + " :" + u);
//			}
//		});
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
