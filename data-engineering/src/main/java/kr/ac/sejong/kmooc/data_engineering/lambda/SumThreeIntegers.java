package kr.ac.sejong.kmooc.data_engineering.lambda;

public class SumThreeIntegers implements ComputeThreeIntegers {
	@Override
	public double compute(int x, int y, int z) {
		return x + y + z;
	}
}
