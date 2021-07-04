package kr.ac.sejong.kmooc.data_engineering.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExample1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		list.forEach(t -> System.out.println(t));
	}
}
