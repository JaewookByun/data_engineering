package kr.ac.sejong.kmooc.data_engineering.lambda;

public class App1 {
	public static void main(String[] args) {
		double sum = new SumThreeIntegers().compute(3, 4, 5);
		System.out.println(sum);

		sum = new ComputeThreeIntegers() {
			@Override
			public double compute(int x, int y, int z) {
				return x + y + z;
			}
		}.compute(3, 4, 5);
		System.out.println(sum);
	}
}
