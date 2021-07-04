package kr.ac.sejong.kmooc.data_engineering.lambda;

import java.util.ArrayList;

public class LambdaExample4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
//		list.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if (o1 < o2)
//					return -1;
//				else if (o1 == o2)
//					return 0;
//				else
//					return +1;
//			}
//		});
		list.sort((o1, o2) -> {
			if (o1 < o2)
				return -1;
			else if (o1 == o2)
				return 0;
			else
				return +1;
		});
		System.out.println(list);
	}
}
