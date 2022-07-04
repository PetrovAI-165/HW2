import java.util.*;

public class CustomLinkedList <E>  extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable{

        private СustomNode<E> head ;

        private int size = 0;
        private СustomNode<E> tail;

        private static class СustomNode<E>{
            // элемент
            E e;
            // Следующий узел
            СustomNode<E> next;
            // предыдущий узел
            СustomNode<E> previous;

            public СustomNode(СustomNode<E> previous,E e,СustomNode<E> next) {
                this.e = e;
                this.next = next;
                this.previous = previous;
            }

    }

    private void linkFirst(E e) {
        final СustomNode<E> f = head;
        final СustomNode<E> newNode = new СustomNode<E>(null, e, f);
        tail = newNode;
        if (f == null)
            tail = newNode;
        else
            f.previous = newNode;
        size++;
        modCount++;
    }

    /**
     * Links e as last element.
     */
    void linkLast(E e) {
        final СustomNode<E> l = tail;
        final СustomNode<E> newNode = new СustomNode<E>(l, e, null);
        tail = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    }
