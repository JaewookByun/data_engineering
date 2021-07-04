package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample20 {

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
		MyHashSet<Integer> myHashSet = new MyHashSet<Integer>(hashSet);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
		LinkedList<Integer> linkedList = new LinkedList<Integer>(hashSet);

		long p0 = System.currentTimeMillis();
		int nextOfZero = Integer.MAX_VALUE;
		for (Integer val : linkedList) {
			if (val > 0 && val < nextOfZero) {
				nextOfZero = val;
			}
		}
		// System.out.println(nextOfZero);
		System.out.println("linkedList: " + (System.currentTimeMillis() - p0));

		// HashSet: 16
		// myHashSet: 66
		// arrayList: 15
		// linkedList: 15

	}
}
