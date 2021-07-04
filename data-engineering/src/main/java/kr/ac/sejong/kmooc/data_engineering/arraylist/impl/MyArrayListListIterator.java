package kr.ac.sejong.kmooc.data_engineering.arraylist.impl;

import java.util.ListIterator;

public class MyArrayListListIterator<E> implements ListIterator<E> {

	private Object[] data;
	private int cursor;

	public MyArrayListListIterator(Object[] data, int index) {
		this.data = data;
		this.cursor = index - 1;
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

	@Override
	public boolean hasPrevious() {
		if (cursor >= 0)
			return true;
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E previous() {
		return (E) data[cursor--];
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void set(E e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub

	}

}
