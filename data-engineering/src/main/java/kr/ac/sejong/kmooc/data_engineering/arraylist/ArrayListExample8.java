package kr.ac.sejong.kmooc.data_engineering.arraylist;

import java.util.List;

import kr.ac.sejong.kmooc.data_engineering.arraylist.impl.MyArrayList;
import kr.ac.sejong.kmooc.data_engineering.motivation.Email;

public class ArrayListExample8 {
	public static void main(String[] args) {
		List<Integer> l = new MyArrayList<Integer>();
		l.add(3);
		l.add(5);
		l.add(5);
		l.add(7);
		System.out.println(l);
		System.out.println(l.indexOf(2));
		System.out.println(l.indexOf(3));
		System.out.println(l.lastIndexOf(3));
		System.out.println(l.indexOf(5));
		System.out.println(l.lastIndexOf(5));

		List<Email> emails = new MyArrayList<Email>();
		emails.add(new Email(0, 1));
		emails.add(new Email(1, 2));
		emails.add(new Email(1, 2));
		emails.add(new Email(2, 3));
		System.out.println(emails);
		System.out.println(emails.indexOf(new Email(0, 0)));
		System.out.println(emails.indexOf(new Email(0, 1)));
		System.out.println(emails.lastIndexOf(new Email(0, 1)));
		System.out.println(emails.indexOf(new Email(1, 2)));
		System.out.println(emails.lastIndexOf(new Email(1, 2)));

//		[3, 5, 5, 7]
//		-1
//		0
//		0
//		1
//		2
//		[0 -> 1, 1 -> 2, 1 -> 2, 2 -> 3]
//		-1
//		0
//		0
//		1
//		2
	}
}
