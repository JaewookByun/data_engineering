package kr.kmooc.dataEngineering.homework2_3;

public class MyNode<E> {
	private E item;
	private MyNode<E> prev;
	private MyNode<E> next;
	
	/**
	 * MyLinkedList용 새로운 MyNode를 생성한다.
	 * 
	 * @param prev 이전노드
	 * @param item 아이템
	 * @param next 다음노드
	 */
	
	public MyNode(MyNode<E> prev, E item, MyNode<E> next){
		this.prev = prev;
		this.item = item;
		this.next = next;
	}

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public MyNode<E> getPrev() {
		return prev;
	}

	public void setPrev(MyNode<E> prev) {
		this.prev = prev;
	}

	public MyNode<E> getNext() {
		return next;
	}

	public void setNext(MyNode<E> next) {
		this.next = next;
	}
	

}
