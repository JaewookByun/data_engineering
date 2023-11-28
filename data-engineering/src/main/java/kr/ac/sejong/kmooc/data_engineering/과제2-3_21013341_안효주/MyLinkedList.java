package kr.kmooc.dataEngineering.homework2_3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyLinkedList<E> implements List<E>, Queue<E>{

	private MyNode<E> first;    // 첫번째 노드
	private MyNode<E> last;     // 마지막 노드
	private int size;           // 데이터의 개수
	
	public MyLinkedList() {
		first = null;
		last = null;
		size=0;
	}
	
	public MyLinkedList(Collection<? extends E> c) {
		this(); // 빈 링크드리스트 생성
		for(E value:c) { // Collection이기 때문에, for-each loop사용가능
			add(value); // 컬렉션을 전부 순회해서 add해주면 생성끝남
		}
	}

	@Override
	public boolean offer(E e) {
		if(first == null ) {
			// 비어 있을 때
			MyNode<E> newNode = new MyNode<E> (null, e,null);
			first= newNode;
			last = newNode;
			size++;
		}
		else {
			// 비어 있지 않을 때
			MyNode<E> newNode = new MyNode<E> (last, e, null);
			last.setNext(newNode);
			last = newNode;
			size++;
		}
		return true;
	}

	@Override
	public E remove() {
		if(size==0) {
			throw new NoSuchElementException();
		}
		else {
			return remove(0);
		}
	}
	

	@Override
	public E poll() {
		if(size==0) {
			return null;
		}
		else {
			return remove(0);
		}
	}

	@Override
	public E element() {
		if(size ==0) {
			throw new NoSuchElementException();
		}
		else {
			return get(0);
		}
	}

	@Override
	public E peek() {
		if(size ==0) {
			return null;
		}
		else {
			return get(0);
		}
	}

	@Override
	public int size() {
		return size; // size변수가 있기 때문에 그대로 반환
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		if(size ==0)
			return false;
		MyNode<E> cursor = first;
		do {
			if(cursor.getItem().equals(o))
				return true;
			cursor = cursor.getNext();
			
		}while(cursor!=null);
		return false;
		
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size];
		int idx =0;
		for(E val : this) {
			array[idx++] = val;
		}
		return array;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		if(first == null ) {
			// 비어 있을 때
			MyNode<E> newNode = new MyNode<E> (null, e,null);
			first= newNode;
			last = newNode;
			size++;
		}
		else {
			// 비어 있지 않을 때
			MyNode<E> newNode = new MyNode<E> (last, e, null);
			last.setNext(newNode);
			last = newNode;
			size++;
		}
		return true;
	}
	
	
	
	@Override
	public String toString() {
		if( size == 0) {
			return "[]";
		}
		
		String result = "[";
		result += first.getItem();
		MyNode<E> cursor = first.getNext(); // 노드를 가르키는 객체
		
		while(cursor!=null) {
			result += "," + cursor.getItem();
			cursor = cursor.getNext(); // 커서가 다음 노드를 가리키도록 갱신
		}

		result += "]";
		return result;
		
	}
	


	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		while(size!=0) {
			remove(0);
		}
		
	}

	
	@Override
	public E get(int index) {
		if(index >=size || index<0)
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
		
		int cIdx=0;
		MyNode<E> cursor = first;
		do {
			if(cIdx == index)
				return cursor.getItem();
			cursor = cursor.getNext();
			cIdx++;
		}while(cursor!=null);
		
		return null;
	}
	
	// iterator할때 만듦
	public MyNode<E> getNode(int index) {
		if(index >=size || index<0)
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
		
		int cIdx=0;
		MyNode<E> cursor = first;
		do {
			if(cIdx == index)
				return cursor;
			cursor = cursor.getNext();
			cIdx++;
		}while(cursor!=null);
		
		return null;
	}
	
	


//	// 안에서만 쓸거기 때문, add(index,element)만들때 추가함
//	private MyNode<E> getNode(int index) {
//		if(index >=size || index<0)
//			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
//		
//		int cIdx=0;
//		MyNode<E> cursor = first;
//		do {
//			if(cIdx == index)
//				return cursor;  // 커서 반환
//			cursor = cursor.getNext();
//			cIdx++;
//		}while(cursor!=null);
//		
//		return null;
//	}
//	
	
	
//	// 수정
//	@Override
//	public void add(int index, E element) {
//		if(index > size || index < 0)
//			throw new IndexOutOfBoundsException();
//		
//		if(size==index) {
//			// 가장 마지막에 추가
//			add(element);
//		}
//		else {
//			// 중간에 추가
//			// first와 last가 다름
//			MyNode<E> next = getNode(index);
//			MyNode<E> prev = next.getPrev();
//			// 새로운 노드 추가
//			MyNode<E> newNode = new MyNode<E> ( prev,element,next);
//			// prev에 대한 참조 재조정
//			if(prev != null) {
//				// 처음 위치에 추가하는 것이 아님
//				prev.setNext(newNode);
//			}
//			else {
//				first = newNode;
//			}
//			next.setPrev(newNode);
//		}
//		size++;
//		
//	}
//	
	
	
	@Override
	public void add(int index, E element) {
	    if (index > size || index < 0)
	        throw new IndexOutOfBoundsException();

	    if (index == size) {
	        // 리스트 끝에 추가
	        MyNode<E> newNode = new MyNode<E>(last, element, null);
	        if (last != null) {
	            last.setNext(newNode);
	        } else {
	            first = newNode; // 리스트가 비어있었음
	        }
	        last = newNode;
	    } else {
	        // 중간에 삽입
	        MyNode<E> next = getNode(index);
	        MyNode<E> prev = next.getPrev();
	        MyNode<E> newNode = new MyNode<E>(prev, element, next);
	        if (prev != null) {
	            prev.setNext(newNode);
	        } else {
	            first = newNode; // 처음에 삽입
	        }
	        next.setPrev(newNode);
	    }
	    size++;
	}
	


	@Override
	public E set(int index, E element) {
		MyNode<E> node = getNode(index);
		E previousOne = node.getItem();
		node.setItem(element);
		return previousOne;
	}

	@Override
	public E remove(int index) {   // 인덱스 기반 리무브
		MyNode<E> nodeToRemove = getNode(index);
		E element = nodeToRemove.getItem();
		MyNode<E> next = nodeToRemove.getNext();
		MyNode<E> prev = nodeToRemove.getPrev();
		
		if(prev == null) {
			// nodeToRemove가 first였음
			first = next;
		}
		else {
			prev.setNext(next);
		}
		
		if(next ==null) {
			// nodeToremove 가 last였음
			last = prev;
		}
		else {
			next.setPrev(prev);
		}
		size--;
		
		return element;   // 지워야할 node를 getnode()로 참조하고, prev와 next를 갱신하여 해당 노드를 list에서 빠져나오게함
		
	}
	

	@Override
	public boolean remove(Object o) {   // 인스턴스 기반 remove
		MyNode<E> nodeToRemove = getNode(o);
		if(nodeToRemove == null)
			return false;
		
		
		MyNode<E> next = nodeToRemove.getNext();
		MyNode<E> prev = nodeToRemove.getPrev();
		if(prev == null) {
			// nodeToRemove가 first였음
			first = next;
		}
		else {
			prev.setNext(next);
		}
		
		if(next ==null) {
			// nodeToremove 가 last였음
			last = prev;
		}
		else {
			next.setPrev(prev);
		}
		size--;
		return true;
	}
	
	// remove인스턴스 만들때 추가함, 인스턴스 기반으로 타켓노드를 찾는 메서드
	private MyNode<E> getNode(Object o) {
			int cIdx=0;
			MyNode<E> cursor = first;
			do {
				if(cursor.getItem().equals(o))
					return cursor;  // 커서 반환
				cursor = cursor.getNext();
				cIdx++;
			}while(cursor!=null);
			
			return null;
		}
	
	

	@Override
	public int indexOf(Object o) {
		if(size == 0)
			return -1;
		
		int cIdx = 0;
		MyNode<E> cursor = first;
		do {
			if(cursor.getItem().equals(o))
				return cIdx;
			cursor = cursor.getNext();
			cIdx++;
		}while(cursor!=null);
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) { // 뒤에서 부터 순회, size조건은 필요없음
		int cIdx = size-1;
		MyNode<E> cursor = last;
		do {
			if(cursor.getItem().equals(o))
				return cIdx;
			cursor = cursor.getPrev();
			cIdx--;
		}while(cursor!=null);
		return -1;
	}

	

	@Override
	public Iterator<E> iterator() {
		return new MyLinkedListListIterator<E>(this,0);
	}

	
	@Override
	public ListIterator<E> listIterator() {
		return new MyLinkedListListIterator<E>(this,0);
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return new MyLinkedListListIterator<E>(this, index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
