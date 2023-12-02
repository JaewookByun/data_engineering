package kr.kmooc.dataEngineering.homework2_3;

import java.util.ListIterator;

// MyLinkedListListIterator 클래스: MyLinkedList를 순회하는 ListIterator 구현 클래스
public class MyLinkedListListIterator<E> implements ListIterator<E> {

    private MyLinkedList<E> data;   // 순회 대상인 MyLinkedList
    private int cursor;              // 현재 인덱스를 나타내는 커서
    private MyNode<E> lastReturned;  // 마지막으로 반환된 노드

    /**
     * MyLinkedListListIterator의 생성자
     *
     * @param data  순회할 MyLinkedList
     * @param index 시작 인덱스
     */
    public MyLinkedListListIterator(MyLinkedList<E> data, int index) {
        this.data = data;
        this.cursor = index - 1;
    }

    /**
     * 현재 인덱스의 다음 위치에 요소가 있는지 여부를 반환
     *
     * @return 다음 위치에 요소가 있으면 true, 그렇지 않으면 false
     */
    @Override
    public boolean hasNext() {
        return cursor + 1 < data.size();
    }

    /**
     * 현재 인덱스의 다음 요소를 반환하고 커서를 다음 위치로 이동
     *
     * @return 다음 요소
     */
    @Override
    public E next() {
        lastReturned = data.getNode(++cursor);
        return lastReturned.getItem();
    }

    /**
     * 현재 인덱스의 이전 위치에 요소가 있는지 여부를 반환
     *
     * @return 이전 위치에 요소가 있으면 true, 그렇지 않으면 false
     */
    @Override
    public boolean hasPrevious() {
        return cursor > 0;
    }

    /**
     * 현재 인덱스의 이전 요소를 반환하고 커서를 이전 위치로 이동
     *
     * @return 이전 요소
     */
    @Override
    public E previous() {
        lastReturned = data.getNode(--cursor);
        return lastReturned.getItem();
    }


    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {
    }

    @Override
    public void set(E e) {
        // 현재 노드의 아이템을 주어진 요소로 설정
        lastReturned.setItem(e);
    }

    @Override
    public void add(E e) {
    }
}
