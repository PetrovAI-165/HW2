import java.util.*;

public class CustomLinkedList <E>  extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable{

        private СustomNode<E> head ;

        private int size = 0;
        private СustomNode<E> tail;

        public CustomLinkedList(){

        }

    public boolean remove(Object o) {
        if (o == null) {
            for ( CustomLinkedList.СustomNode<E> x = head; x != null; x = x.next) {
                if (x.e == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for ( CustomLinkedList.СustomNode<E> x = head; x != null; x = x.next) {
                if (o.equals(x.e)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    E unlink(CustomLinkedList.СustomNode<E> x) {
        final E element = x.e;
        final CustomLinkedList.СustomNode<E> next = x.next;
        final CustomLinkedList.СustomNode<E> previous = x.previous;

        if (previous == null) {
            head = next;
        } else {
            previous.next = next;
            x.previous = null;
        }

        if (next == null) {
            tail = previous;
        } else {
            next.previous = previous;
            x.next = null;
        }

        x.e = null;
        return element;
    }

        public E get(int index) {
            return node(index).e;
        }

        public E getFirst() {
            final СustomNode<E> f = head;
            if (f == null)
                throw new NoSuchElementException();
            return f.e;
        }

        public E getLast() {
            final СustomNode<E> l = tail;
            if (l == null)
                throw new NoSuchElementException();
            return l.e;
        }

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
        final CustomLinkedList.СustomNode<E> f = head;
        final CustomLinkedList.СustomNode<E> newNode = new СustomNode<E>(null, e, f);
        tail = newNode;
        if (f == null)
            head = newNode;
        else
            f.previous = newNode;
        this.size++;
    }
    /**
     * Links e as last element.
     */
    void linkLast(E e) {
        final CustomLinkedList.СustomNode<E> l = tail;
        final CustomLinkedList.СustomNode<E> newNode = new СustomNode<E>(l, e, null);
        tail = newNode;
        if (l == null)
            tail = newNode;
        else
            l.next = newNode;
        this.size++;
    }



    СustomNode <E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            CustomLinkedList.СustomNode<E> x = head;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            CustomLinkedList.СustomNode<E> x = tail;
            for (int i = size - 1; i > index; i--)
                x = x.previous;
            return x;
        }
    }

    public E set(int index, E element) {
        СustomNode <E> x = node(index);
        E oldVal = x.e;
        x.e = element;
        return oldVal;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    @Override
    public void addFirst(E e) {
        linkFirst(e);
    }

    @Override
    public void addLast(E e) {
        linkLast(e);
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
        return size;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    }
