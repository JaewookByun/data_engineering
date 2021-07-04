package kr.ac.sejong.kmooc.data_engineering.hashset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import kr.ac.sejong.kmooc.data_engineering.hashset.impl.MyHashSet;

public class HashSetExample7 {

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
	public static MyHashSet<Integer> getHashSetSenderIDs() throws IOException {
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
			data.add(from);
			// System.out.println(++count);
		}
		br.close();
		return data;
	}
	
	@SuppressWarnings("unused")
	public static MyHashSet<Integer> getHashSetReceiverIDs() throws IOException {
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
	public static void main(String[] args) throws IOException {

		MyHashSet<Integer> senderSet = getHashSetSenderIDs();
		MyHashSet<Integer> receiverSet = getHashSetReceiverIDs();
		
		System.out.println("보낸 사람 수: " + senderSet.size());
		System.out.println("받는 사람 수: " + receiverSet.size());
		
		// senderSet.addAll(receiverSet);
		// System.out.println("이메일 네트워크에 참여한 사람의 수 : " + senderSet.size());
		// 이메일 네트워크에 참여한 사람의 수 : 265214
		// 이메일을 보내기도 하고 받기도 한 사람의 수 : 34855
		// 이메일을 보내기만 한 사람의 수 : 190554
		// 이메일을 받기만 한 사람의 수 : 39805
		//senderSet.retainAll(receiverSet);
		//System.out.println("이메일을 보내기도 하고 받기도 한 사람의 수 : " + senderSet.size());
		
		receiverSet.removeAll(senderSet);
		System.out.println("이메일을 받기만 한 사람의 수 : " + receiverSet.size());
	}
}
