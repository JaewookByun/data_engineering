package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App12 {

	public static Email[] getData() throws IOException {
		Email[] data = new Email[420045];
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sejong\\DE\\email.txt"));
		int index = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			data[index++] = new Email(from, to);
		}
		br.close();
		return data;
	}

	public static void main(String[] args) throws IOException {

		Email[] data = getData();

		int lower = Integer.MIN_VALUE;
		for (Email email : data) {
			int from = email.from;
			int to = email.to;
			if (from < 100000 && from > lower) {
				lower = from;
			}
			if (to < 100000 && to > lower) {
				lower = to;
			}
		}
		System.out.println("100000 이전의 수: " + lower);
	}
}
