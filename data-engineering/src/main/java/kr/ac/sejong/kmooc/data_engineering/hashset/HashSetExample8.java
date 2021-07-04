package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class HashSetExample8 {

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

	@SuppressWarnings("unused")
	public static HashSet<Integer> getHashSetReceiverIDs() throws IOException {
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
			int to = Integer.parseInt(array[1]);
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
	public static void main(String[] args) throws IOException {
		List<Email> data = getArrayList();
		
		ArrayList<HashSet<Integer>> receivers = new ArrayList<HashSet<Integer>>();
		for(int i = 0; i < 265214 ; i++) {
			receivers.add(new HashSet<Integer>());
		}
		
		for(Email email: data) {
			int from = email.getFrom();
			int to = email.getTo();
			
			// receivers의 from index의 HashSet에 to를 추가 할 것 입니다. 
			HashSet<Integer> current = receivers.get(from);
			current.add(to);
			receivers.set(from, current);
		}
		
		for(int i = 0 ; i < receivers.size() ; i++) {
			System.out.println(i + " : " + receivers.get(i));
		}

	}
}
