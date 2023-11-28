package kr.kmooc.dataEngineering.homework2_3;

import java.util.ListIterator;

public class MyLinkedListListIterator<E> implements ListIterator<E> {
	
	private MyLinkedList<E> data;
	private int cursor;
	private MyNode<E> lastReturned;
	
	public MyLinkedListListIterator(MyLinkedList<E> data , int index) {
		this.data = data;
		this.cursor = index-1;
	}

	@Override
	public boolean hasNext() {
		if(cursor + 1 < data.size())
			return true;
		else
		return false;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		lastReturned = data.getNode(++cursor);
		return (E)lastReturned.getItem();
	}


	@Override
	public boolean hasPrevious() {
		if(cursor >= 0)
			return true;
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E previous() {
		lastReturned = data.getNode(cursor);
		return (E) data.get(cursor--);
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
		lastReturned.setItem(e);
		
	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
