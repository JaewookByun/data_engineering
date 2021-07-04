package kr.ac.sejong.kmooc.data_engineering.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class StreamExample44 {

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

		// ID의 등장 횟수: 보낸 사람, 받는 사람을 flatMap 수행, groupingBy 수행
		Map<Integer, Long> occurrence = data.stream().parallel().flatMap(e -> Stream.of(e.getFrom(), e.getTo()))
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		occurrence.forEach((k, v) -> System.out.println(k + " -> " + v));

	}
}
