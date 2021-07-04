package kr.ac.sejong.kmooc.data_engineering.treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		System.out.println(set);

		HashSet<Integer> hSet = new HashSet<Integer>();
		hSet.add(3);
		hSet.add(5);
		hSet.add(2);
		hSet.add(4);
		hSet.add(1);
		TreeSet<Integer> treeSet = new TreeSet<Integer>(hSet);
		System.out.println(treeSet);
	}
}
