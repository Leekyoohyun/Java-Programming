package Chap04;

public class Node<E> {
    public E elem;
    public Node<E> next;

    public Node(E item){
        elem = item;
        next = null;
    }
}
