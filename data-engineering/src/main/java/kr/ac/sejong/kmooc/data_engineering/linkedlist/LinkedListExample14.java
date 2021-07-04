package kr.ac.sejong.kmooc.data_engineering.linkedlist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class LinkedListExample14 {

	@SuppressWarnings("unused")
	public static ArrayList<Email> getArrayList() throws IOException {
		ArrayList<Email> data = new ArrayList<Email>();
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
	public static LinkedList<Email> getLinkedList() throws IOException {
		LinkedList<Email> data = new LinkedList<Email>();
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

	public static void main(String[] args) throws IOException {
		ArrayList<Email> array = getArrayList();
		LinkedList<Email> link = getLinkedList();

		long p1 = System.currentTimeMillis();
		while (true) {
			if (array.size() > 0)
				array.remove(array.size()-1);
			else
				break;
		}
		System.out.println("ArrayList: " + (System.currentTimeMillis()-p1));

		long p2 = System.currentTimeMillis();
		while (true) {
			Email email = link.poll();
			if (email == null)
				break;
		}
		System.out.println("LinkedList: " + (System.currentTimeMillis()-p2));
		
//		ArrayList: 9126 (Queue emulation)
//		LinkedList: 13
//		ArrayList: 8   (Stack)
	}
}
