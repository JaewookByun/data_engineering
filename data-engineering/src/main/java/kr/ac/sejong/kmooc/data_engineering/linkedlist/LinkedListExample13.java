package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class LinkedListExample13 {

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
			data.add(new Email(from, to));
			// System.out.println(++count);
		}
		br.close();
		return data;
	}

	@SuppressWarnings("unused")
	public static List<Email> getLinkedList() throws IOException {
		List<Email> data = new LinkedList<Email>();
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
			data.add(new Email(from, to));
			// System.out.println(++count);
		}
		br.close();
		return data;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		List<Email> array = getArrayList();
		List<Email> link = getLinkedList();

		long p1 = System.currentTimeMillis();
		int from = 0;
		for (Email email : array) {
			from += email.getFrom();
		}
		System.out.println("ArrayList: " + (System.currentTimeMillis() - p1));

		long p2 = System.currentTimeMillis();
		from = 0;
		for (Email email : link) {
			from += email.getFrom();
		}
		System.out.println("LinkedList: " + (System.currentTimeMillis() - p2));
		
		long p3 = System.currentTimeMillis();
		from = 0;
		for (int i = 0 ; i < array.size() ; i++) {
			from += array.get(i).getFrom();
		}
		System.out.println("ArrayList: " + (System.currentTimeMillis() - p3));

		long p4 = System.currentTimeMillis();
		from = 0;
		for (int i = 0 ; i < link.size() ; i++) {
			from += link.get(i).getFrom();
			System.out.println(i);
		}
		System.out.println("LinkedList: " + (System.currentTimeMillis() - p4));
	}
}
