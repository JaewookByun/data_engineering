package kr.ac.sejong.kmooc.data_engineering.arraylist.impl;

import java.util.Iterator;

public class MyArrayListIterator<E> implements Iterator<E> {

	private Object[] data;
	private int cursor;

	public MyArrayListIterator(Object[] data) {
		this.data = data;
		this.cursor = -1;
	}

	@Override
	public boolean hasNext() {
		if (cursor + 1 < data.length)
			return true;
		else
			return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		return (E) data[++cursor];
	}

}
