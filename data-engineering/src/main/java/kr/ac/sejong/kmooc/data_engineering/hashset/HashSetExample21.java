package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample21 {

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
		ArrayList<Integer> arrayList = new ArrayList<Integer>(myHashSet);
		arrayList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2)
					return -1;
				else if (o1 == o2)
					return 0;
				else
					return +1;
			}
		});
		for (Integer val : arrayList) {
			System.out.println(val);
		}

		TreeSet<Integer> treeSet = new TreeSet<Integer>(hashSet);
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.higher(0));
		Iterator<Integer> dIter = treeSet.descendingIterator();
		while (dIter.hasNext()) {
			System.out.println(dIter.next());
		}
	}
}
