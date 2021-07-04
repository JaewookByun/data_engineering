package kr.ac.sejong.kmooc.data_engineering.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class StreamExample45 {

	public static ArrayList<Email> getData() throws IOException {
		ArrayList<Email> data = new ArrayList<Email>();
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
			data.add(new Email(from, to));
		}
		br.close();
		return data;
	}

	public static void main(String[] args) throws IOException {

		ArrayList<Email> data = getData();

		// 각 보낸 사람에 대한 받는 사람들
		Map<Integer, List<Integer>> senderMap = data.stream().collect(
				Collectors.groupingBy(e -> e.getFrom(), Collectors.mapping(e -> e.getTo(), Collectors.toList())));
		senderMap.forEach((k, v) -> System.out.println(k + " -> " + v));
	}
}
