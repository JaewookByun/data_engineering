package kr.kmooc.dataEngineering.homework2_3;

import java.util.*;

public class MyLinkedList<E> implements List<E>, Queue<E> {
    private MyNode<E> first;
    private MyNode<E> last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }
    // MyLinkedList의 생성자: 컬렉션을 받아 초기화

    public MyLinkedList(Collection<? extends E> c) {
        this();
        for (E value : c) {
            add(value);
        }
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
    // offer 메서드: 큐에 요소 추가
    public boolean offer(E e) {
        if (first == null) {
            // 비어 있을 때
            MyNode<E> newNode = new MyNode<>(null, e, null);
            first = newNode;
            last = newNode;
            size++;
        } else {
            // 비어 있지 않을 때
            MyNode<E> newNode = new MyNode<>(last, e, null);
            last.setNext(newNode);
            last = newNode;
            size++;
        }
        return true;
    }
    // remove 메서드: 큐에서 요소 제거
    @Override
    public E remove() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return remove(0);
    }

    @Override
    // poll 메서드: 큐에서 요소 제거 및 반환
    public E poll() {
        if (size == 0) {
            return null;
        }
        return remove(0);
    }

    @Override
    // element 메서드: 큐의 첫 번째 요소 반환
    public E element() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return get(0);
    }
    // peek 메서드: 큐의 첫 번째 요소 반환 (비어 있을 경우 null 반환)
    @Override
    public E peek() {
        if (size == 0) {
            return null;
        }
        return get(0);
    }
    @Override
    public boolean contains(Object o) {
        if (size == 0) {
            return false;
        }
        MyNode<E> cursor = first;
        do {
            if (cursor.getItem().equals(o)) {
                return true;
            }
            cursor = cursor.getNext();
        } while(cursor != null);
        return false;
    }

    @Override
    // iterator 메서드: 리스트를 순회하는 Iterator 반환
    public Iterator<E> iterator() {
        return new MyLinkedListListIterator<E>(this, 0);
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int idx = 0;
        for (E val : this) {
            array[idx++] = val;
        }
        return array;
    }
    // toArray 메서드 (제네릭 버전): 리스트의 요소들을 주어진 배열에 저장
    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean add(E e) {
        if (first == null) {
            // 비어 있을 때
            MyNode<E> newNode = new MyNode<>(null, e, null);
            first = newNode;
            last = newNode;
            size++;
        } else {
            // 비어 있지 않을 때
            MyNode<E> newNode = new MyNode<>(last, e, null);
            last.setNext(newNode);
            last = newNode;
            size++;
        }
        return true;
    }
    // toString 메서드: 리스트의 내용을 문자열로 반환
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        String result = "[";
        result += first.getItem();
        MyNode<E> cursor = first.getNext();

        while (cursor != null) {
            result += ", " + cursor.getItem();
            cursor = cursor.getNext();
        }
        result += "]";
        return result;
    }
    @Override
    public boolean remove(Object o) {
        MyNode<E> nodeToRemove = getNode(o);
        if (nodeToRemove == null) {
            return false;
        }

        MyNode<E> next = nodeToRemove.getNext();
        MyNode<E> prev = nodeToRemove.getPrev();

        if (prev == null) {
            first = next;
        } else {
            prev.setNext(next);
        }
        if (next == null) {
            last = prev;
        } else {
            next.setPrev(prev);
        }
        size--;
        return true;
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
        first = null;
        last = null;
        size = 0;
    }

    public MyNode<E> getNode(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        int cIdx = 0;
        MyNode<E> cursor = first;

        do {
            if (cIdx == index) {
                return cursor;
            }
            cursor = cursor.getNext();
            cIdx++;
        } while(cursor != null);
        return null;
    }

    private MyNode<E> getNode(Object o) {
        int cIdx = 0;
        MyNode<E> cursor = first;

        do {
            if (cursor.getItem().equals(o)) {
                return cursor;
            }
            cursor = cursor.getNext();
            cIdx++;
        } while(cursor != null);
        return null;
    }
    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }

        int cIdx = 0;
        MyNode<E> cursor = first;

        do {
            if (cIdx == index) {
                return cursor.getItem();
            }
            cursor = cursor.getNext();
            cIdx++;
        } while(cursor != null);
        return null;
    }
    @Override
    public E set(int index, E element) {
        MyNode<E> node = getNode(index);
        E previousOne = node.getItem();
        node.setItem(element);
        return previousOne;
    }

    @Override
    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (size == index) {
            add(element);
            size--;
        } else {
            // 중간에 추가
            MyNode<E> next = getNode(index);
            MyNode<E> prev = next.getPrev();
            // 새로운 노드 추가
            MyNode<E> newNode = new MyNode<E>(prev, element, next);

            // prev에 대한 참조 재조정
            if (prev != null) {
                // 처음 위치에 추가하는 것이 아님
                prev.setNext(newNode);
            } else {
                first = newNode;
            }
            next.setPrev(newNode);
        }
        size++;
    }

    @Override
    public E remove(int index) {
        MyNode<E> nodeToRemove = getNode(index);
        E element = nodeToRemove.getItem();

        MyNode<E> next = nodeToRemove.getNext();
        MyNode<E> prev = nodeToRemove.getPrev();

        if (prev == null) {
            first = next;
        } else {
            prev.setNext(next);
        }
        if (next == null) {
            last = prev;
        } else {
            next.setPrev(prev);
        }
        size--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        int cIdx = 0;
        MyNode<E> cursor = first;

        do {
            if (cursor.getItem().equals(o)) {
                return cIdx;
            }
            cursor = cursor.getNext();
            cIdx++;
        } while(cursor != null);
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int cIdx = size - 1;
        MyNode<E> cursor = last;
        do {
            if (cursor.getItem().equals(o)) {
                return cIdx;
            }
            cursor = cursor.getPrev();
            cIdx--;
        } while(cursor != null);
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new MyLinkedListListIterator<E>(this, 0);
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