package kr.ac.sejong.kmooc.data_engineering.hashset.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

@SuppressWarnings("unchecked")
public class MyHashSet<E> implements Set<E> {

	private LinkedList<E>[] hashTable;
	private int size;
	private int capacity;

	public MyHashSet() {
		capacity = 4096;
		size = 0;
		hashTable = new LinkedList[capacity];
		for (int i = 0; i < capacity; i++) {
			hashTable[i] = new LinkedList<E>();
		}
	}

	public MyHashSet(int capacity) {
		this.capacity = capacity;
		size = 0;
		hashTable = new LinkedList[capacity];
		for (int i = 0; i < capacity; i++) {
			hashTable[i] = new LinkedList<E>();
		}
	}

	public MyHashSet(Collection<? extends E> c) {
		this();
		for (E val : c) {
			this.add(val);
		}
	}
	
	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}

		String result = "[";
		
		Iterator<E> iterator = this.iterator();
		result += iterator.next();

		while(iterator.hasNext()) {
			result += ", " + iterator.next();
		}

		result += "]";
		return result;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean add(E e) {
		// e라는 E타입의 instance를 hashTable에 삽입
		int idx = e.hashCode() % capacity;
		LinkedList<E> list = hashTable[idx];
		if (!list.contains(e)) {
			list.add(e);
			size++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean contains(Object o) {
		int idx = o.hashCode() % capacity;
		LinkedList<E> list = hashTable[idx];
		return list.contains(o);
	}

	@Override
	public boolean remove(Object o) {
		int idx = o.hashCode() % capacity;
		LinkedList<E> list = hashTable[idx];
		boolean isRemoved = list.remove(o);
		if (isRemoved)
			size--;
		return isRemoved;
	}

	@Override
	public void clear() {
		hashTable = new LinkedList[capacity];
		for (int i = 0; i < capacity; i++) {
			hashTable[i] = new LinkedList<E>();
		}
		size = 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new MyHashSetIterator<E>(hashTable);
	}

	@Override
	public <T> T[] toArray(T[] a) {
		if (a.length < size) {
			a = (T[]) Array.newInstance(a.getClass().componentType(), size);
		}
		int idx = 0;
		for (Object val : this) {
			a[idx++] = (T) val;
		}
		return a;
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size];
		int idx = 0;
		for (Object val : this) {
			array[idx++] = val;
		}
		return array;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// c의 instance를 확인해 보며, 단 한개라도 myHashSet에 없다면
		// false를 반환
		for (Object val : c) {
			if (!this.contains(val))
				return false;
		}
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// c collection의 요소 instance
		boolean isChanged = false;
		for (E instance : c) {
			if (this.add(instance))
				isChanged = true;
		}
		return isChanged;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// 현재의 set을 순회하면서, c와의 공통의 요소를 ArrayList에 삽입
		ArrayList<E> retainList = new ArrayList<E>();
		boolean isChanged = false;
		for (E val : this) {
			if (c.contains(val)) {
				retainList.add(val);
			} else {
				isChanged = true;
			}
		}
		// 현재의 set을 clear
		this.clear();
		// ArrayList를 순회하며 현재 set에 add
		for (E val : retainList) {
			this.add(val);
		}
		return isChanged;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		boolean isChanged = false;
		for (Object val : c) {
			if (this.contains(val)) {
				this.remove(val);
				isChanged = true;
			}
		}
		return isChanged;
	}
}
