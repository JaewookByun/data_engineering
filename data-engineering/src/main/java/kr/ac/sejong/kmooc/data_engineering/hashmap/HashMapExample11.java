package kr.ac.sejong.kmooc.data_engineering.hashmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class HashMapExample11 {

	@SuppressWarnings("unused")
	public static List<Email> getArrayList() throws IOException {
		List<Email> data = new ArrayList<Email>();
		BufferedReader br = new BufferedReader(new FileReader("d:\\email.txt"));
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
		// List<Email> data = getArrayList();

		List<Email> data = List.of(new Email(1, 2), new Email(2, 4), new Email(2, 8));

		HashMap<Integer, HashSet<Integer>> receivers = new HashMap<Integer, HashSet<Integer>>();
		for (Email email : data) {
			int from = email.getFrom();
			int to = email.getTo();
			HashSet<Integer> set = null;
			if (!receivers.containsKey(from)) {
				// from key에 대해 to가 최초로 등장하였다.
				set = new HashSet<Integer>();
			} else {
				set = receivers.get(from);
			}
			set.add(to);
			receivers.put(from, set);
		}

		System.out.println("receivers 생성 완료");

		// a -> b -> c 
		// a에 대한 c를 담는 collection 
		HashMap<Integer, HashSet<Integer>> receivers2 = new HashMap<Integer, HashSet<Integer>>();
		// <a,b> 쌍에 대해
		for (Entry<Integer, HashSet<Integer>> entry : receivers.entrySet()) {
			// <b> 집합에 대해 
			HashSet<Integer> receiverSet = entry.getValue();
			// 각 <b> 에 대해 
			for (Integer receiver : receiverSet) {
				// receiver2가 a를 key로 갖는다면 <c>를 담을 새로운 용기를 만들어야함
				if (!receivers2.containsKey(entry.getKey())) {
					HashSet<Integer> receiverSet2 = new HashSet<Integer>();
					if (receivers.containsKey(receiver))
						receiverSet2.addAll(receivers.get(receiver));
					// < a, <c>> 추가 
					receivers2.put(entry.getKey(), receiverSet2);
				} else {
					HashSet<Integer> receiverSet2 = receivers2.get(entry.getKey());
					if (receivers.containsKey(receiver))
						receiverSet2.addAll(receivers.get(receiver));
					receivers2.put(entry.getKey(), receiverSet2);
				}
			}
		}

		for (Entry<Integer, HashSet<Integer>> entry : receivers2.entrySet()) {
			System.out.println(entry);
		}
	}
}
