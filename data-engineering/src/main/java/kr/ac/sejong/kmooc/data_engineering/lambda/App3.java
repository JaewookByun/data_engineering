package kr.ac.sejong.kmooc.data_engineering.lambda;

public class App3 {
	public static void main(String[] args) {

		ComputeThreeIntegers cti2 = (a, b, c) -> a + b + c;
		System.out.println(cti2.compute(3, 4, 5));

		ConsumeThreeIntegers cti3 = (a, b, c) -> System.out.println(a + b + c);
		cti3.consume(3, 4, 5);

		ComputeRadius cr = r -> 3.14 * r * r;
		System.out.println(cr.compute(3));
	}
}
