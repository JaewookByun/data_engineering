package kr.ac.sejong.kmooc.data_engineering.hashset.impl;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSetIterator<E> implements Iterator<E> {

	private LinkedList<E>[] hashTable;
	private int tableIndex;
	private int listIndex;

	@SuppressWarnings("unused")
	public MyHashSetIterator(LinkedList<E>[] hashTable) {
		this.hashTable = hashTable;
		tableIndex = 0;
		listIndex = 0;
		while (true) {
			// tableIndex에 해당하는 LinkedList가 있는지 볼 것입니다.
			try {
				LinkedList<E> list = hashTable[tableIndex];
			} catch (Exception e) {
				tableIndex = -1;
				break;
			}
			//
			try {
				hashTable[tableIndex].get(listIndex);
				break;
			} catch (Exception e) {
				tableIndex++;
				listIndex = 0;
			}
		}
	}

	@Override
	public boolean hasNext() {
		return tableIndex != -1;
	}

	@SuppressWarnings("unused")
	@Override
	public E next() {
		// 현재의 tableIndex , listIndex에 해당하는 E를 얻고
		E item = hashTable[tableIndex].get(listIndex++);
		// null이면 반환하며,
		if (item == null)
			return null;
		// null이 아니라면, 다음으로 tableIndex, listIndex를 이동시킬 예정
		// 더이상 요소가 없을 경우 tableIndex = -1;
		while (true) {
			// tableIndex에 해당하는 LinkedList가 있는지 볼 것입니다.
			try {
				LinkedList<E> list = hashTable[tableIndex];
			} catch (Exception e) {
				tableIndex = -1;
				break;
			}
			//
			try {
				hashTable[tableIndex].get(listIndex);
				break;
			} catch (Exception e) {
				tableIndex++;
				listIndex = 0;
			}
		}
		return item;
	}
}
