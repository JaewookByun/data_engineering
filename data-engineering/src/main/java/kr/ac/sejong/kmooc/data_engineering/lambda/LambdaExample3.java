package kr.ac.sejong.kmooc.data_engineering.lambda;

import java.util.ArrayList;

public class LambdaExample3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//		list.replaceAll(new UnaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer t) {
//				return t + 1;
//			}
//		});
		list.replaceAll(t -> t + 1);
		System.out.println(list);
	}
}
