package kr.ac.sejong.kmooc.data_engineering.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class StreamExample43 {

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

		// 최소 사람 ID를 구하기: 보낸 사람, 받는 사람 flatMap --> 최소값 minBy
		int min = data.stream().parallel().flatMap(e -> Stream.of(e.getFrom(), e.getTo()))
				.collect(Collectors.minBy((e1, e2) -> {
					if (e1 < e2)
						return -1;
					else if (e1 == e2)
						return 0;
					else
						return +1;
				})).get();
		System.out.println(min);

		// 최대 사람 ID를 구하기: 보낸 사람, 받는 사람 flatMap --> 최대값 maxBy
		int max = data.stream().parallel().flatMap(e -> Stream.of(e.getFrom(), e.getTo()))
				.collect(Collectors.maxBy((e1, e2) -> {
					if (e1 < e2)
						return -1;
					else if (e1 == e2)
						return 0;
					else
						return +1;
				})).get();
		System.out.println(max);

	}
}
