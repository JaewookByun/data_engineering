package kr.kmooc.dataEngineering.homework2_3;

// MyNode 클래스: 연결 리스트의 노드를 나타내는 클래스
public class MyNode<E> {
    private E item;             // 현재 노드의 아이템
    private MyNode<E> prev;     // 이전 노드에 대한 참조
    private MyNode<E> next;     // 다음 노드에 대한 참조

    public MyNode(MyNode<E> prev, E item, MyNode<E> next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }

    // 현재 노드의 아이템을 반환
    public E getItem() {
        return item;
    }

    // 현재 노드의 아이템을 설정
    public void setItem(E item) {
        this.item = item;
    }

    // 이전 노드에 대한 참조를 반환
    public MyNode<E> getPrev() {
        return prev;
    }

    // 이전 노드에 대한 참조를 설정
    public void setPrev(MyNode<E> prev) {
        this.prev = prev;
    }

    // 다음 노드에 대한 참조를 반환
    public MyNode<E> getNext() {
        return next;
    }

    // 다음 노드에 대한 참조를 설정
    public void setNext(MyNode<E> next) {
        this.next = next;
    }
}
