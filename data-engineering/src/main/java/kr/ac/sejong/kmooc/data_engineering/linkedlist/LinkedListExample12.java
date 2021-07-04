package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.linkedlist.impl.MyLinkedList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class LinkedListExample12 {

	@SuppressWarnings("unused")
	public static List<Email> getArrayList() throws IOException {
		List<Email> data = new ArrayList<Email>();
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
			data.add(0, new Email(from, to));
			// System.out.println(++count);
		}
		br.close();
		return data;
	}

	@SuppressWarnings("unused")
	public static List<Email> getLinkedList() throws IOException {
		List<Email> data = new MyLinkedList<Email>();
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
			data.add(0, new Email(from, to));
			// System.out.println(++count);
		}
		br.close();
		return data;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		long p1 = System.currentTimeMillis();
		List<Email> array = getArrayList();
		System.out.println("ArrayList: " + (System.currentTimeMillis() - p1));
		long p2 = System.currentTimeMillis();
		List<Email> link = getLinkedList();
		System.out.println("LinkedList: " + (System.currentTimeMillis() - p2));
//		ArrayList: 9440
//		LinkedList: 133
//		MyLinkedList: 138
	}
}
