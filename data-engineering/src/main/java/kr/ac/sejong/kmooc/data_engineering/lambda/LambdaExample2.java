package kr.ac.sejong.kmooc.data_engineering.lambda;

import java.util.ArrayList;

public class LambdaExample2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		// 짝수를 제거
//		list.removeIf(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				if (t % 2 == 0)
//					return true;
//				return false;
//			}
//		});
		list.removeIf(t -> {
			if (t % 2 == 0)
				return true;
			return false;
		});
		System.out.println(list);
	}
}
