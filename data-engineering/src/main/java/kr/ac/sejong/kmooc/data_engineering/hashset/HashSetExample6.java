package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample6 {

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
	public static HashSet<Integer> getHashSetSenderIDs() throws IOException {
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
			data.add(from);
			// System.out.println(++count);
		}
		br.close();
		return data;
	}

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

		HashSet<Integer> idSet = getHashSetID();
		HashSet<Integer> senderSet = getHashSetSenderIDs();
		MyHashSet<Integer> senderSet2 = new MyHashSet<Integer>(senderSet);
		ArrayList<Integer> senderArrayList = new ArrayList<Integer>(senderSet);
		LinkedList<Integer> senderLinkedList = new LinkedList<Integer>(senderSet);

		long p0 = System.currentTimeMillis();
		for (Integer id : idSet) {
			senderSet2.contains(id);
		}
		System.out.println("MyHashSet: " + (System.currentTimeMillis() - p0));
		
		long p1 = System.currentTimeMillis();
		for (Integer id : idSet) {
			senderSet.contains(id);
		}
		System.out.println("HashSet: " + (System.currentTimeMillis() - p1));
		long p2 = System.currentTimeMillis();
		int c = 0;
		for (Integer id : idSet) {
			senderArrayList.contains(id);
			if (++c % 10000 == 0)
				System.out.println(c);
		}
		System.out.println("ArrayList: " + (System.currentTimeMillis() - p2));
		long p3 = System.currentTimeMillis();
		c = 0;
		for (Integer id : idSet) {
			senderLinkedList.contains(id);
			if (++c % 10000 == 0)
				System.out.println(c);
		}
		System.out.println("LinkedList: " + (System.currentTimeMillis() - p3));
		// MyHashSet: 266
		// HashSet: 21
		// HashSet: 95
		// ArrayList: 226085
		// LinkedList: 305073
	}
}
