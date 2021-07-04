package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExample19 {

	public static HashSet<Integer> getHashSetID() throws IOException {
		HashSet<Integer> data = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sejong\\DE\\email.txt"));
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			data.add(from);
			data.add(to);
		}
		br.close();
		return data;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		HashSet<Integer> hashSet = getHashSetID();
		ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
		LinkedList<Integer> linkedList = new LinkedList<Integer>(hashSet);

		long p0 = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			int min = Integer.MAX_VALUE;
			for (Integer val : linkedList) {
				if (val < min) {
					min = val;
				}
			}
			System.out.println(min);
		}
		System.out.println("linkedList: " + (System.currentTimeMillis() - p0));

		// HashSet: 20
		// arrayList: 12
		// linkedList: 12

//		TreeSet<Integer> treeSet = new TreeSet<Integer>(hashSet);
//		long p1 = System.currentTimeMillis();
//		for (int i = 0; i < 100; i++) {
//			System.out.println(treeSet.first());
//		}
//		System.out.println("treeSet: " + (System.currentTimeMillis() - p1));

	}
}
