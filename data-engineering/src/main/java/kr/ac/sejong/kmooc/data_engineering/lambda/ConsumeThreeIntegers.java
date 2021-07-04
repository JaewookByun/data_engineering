package kr.ac.sejong.kmooc.data_engineering.lambda;

@FunctionalInterface
public interface ConsumeThreeIntegers {
	public void consume(int x, int y, int z);
}
