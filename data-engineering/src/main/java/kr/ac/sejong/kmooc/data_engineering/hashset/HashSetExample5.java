package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample5 {

	@SuppressWarnings("unused")
	public static MyHashSet<Integer> getMyHashSetID() throws IOException {
		MyHashSet<Integer> data = new MyHashSet<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sejong\\DE\\email.txt"));
		int count = 0;
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
			// System.out.println(++count);
		}
		br.close();
		return data;
	}
	
	@SuppressWarnings("unused")
	public static HashSet<Integer> getHashSetID() throws IOException {
		HashSet<Integer> data = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sejong\\DE\\email.txt"));
		int count = 0;
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
			// System.out.println(++count);
		}
		br.close();
		return data;
	}

	@SuppressWarnings("unused")
	public static ArrayList<Integer> getArrayListID() throws IOException {
		ArrayList<Integer> data = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sejong\\DE\\email.txt"));
		int count = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			if (!data.contains(from))
				data.add(from);
			if (!data.contains(to))
				data.add(to);
			if (count++ % 10000 == 0)
				System.out.println(count);
		}
		br.close();
		return data;
	}

	@SuppressWarnings("unused")
	public static LinkedList<Integer> getLinkedListID() throws IOException {
		LinkedList<Integer> data = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sejong\\DE\\email.txt"));
		int count = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			if (!data.contains(from))
				data.add(from);
			if (!data.contains(to))
				data.add(to);
			if (count++ % 10000 == 0)
				System.out.println(count);
		}
		br.close();
		return data;
	}

	public static void main(String[] args) throws IOException {
		long p0 = System.currentTimeMillis();
		getMyHashSetID();
		System.out.println("MyHashSet: " + (System.currentTimeMillis() - p0));
		long p1 = System.currentTimeMillis();
		getHashSetID();
		System.out.println("HashSet: " + (System.currentTimeMillis() - p1));
		long p2 = System.currentTimeMillis();
		getArrayListID();
		System.out.println("ArrayList: " + (System.currentTimeMillis() - p2));
		long p3 = System.currentTimeMillis();
		getLinkedListID();
		System.out.println("LinkedList: " + (System.currentTimeMillis() - p3));
		
		// MyHashSet: 514
		// HashSet: 144
		// HashSet: 214
		// ArrayList: 207542
		// LinkedList: 1236694
	}
}
