package kr.ac.sejong.kmooc.data_engineering.motivation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
	public static void main(String[] args) throws IOException {
		// C:\Users\Sejong\DE\email.txt
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sejong\\DE\\email.txt"));
		int lineCount = 0; // 줄 수를 담는 line 변수
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			lineCount++;
			if (line.startsWith("#"))
				continue;
			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			System.out.println(new Email(from, to));
		}
		System.out.println("줄 수: " + lineCount);
		br.close();
	}
}
