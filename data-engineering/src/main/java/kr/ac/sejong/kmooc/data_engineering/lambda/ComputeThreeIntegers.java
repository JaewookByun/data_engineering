package kr.ac.sejong.kmooc.data_engineering.lambda;

@FunctionalInterface
public interface ComputeThreeIntegers {
	public double compute(int x, int y, int z);
}
