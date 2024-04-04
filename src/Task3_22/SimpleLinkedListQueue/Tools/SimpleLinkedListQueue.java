package Task3_22.SimpleLinkedListQueue.Tools;

import java.util.Comparator;

public class SimpleLinkedListQueue<T> extends SimpleLinkedList<T> implements SimpleQueue<T> {
    @Override
    public void add(T value) {
        addLast(value);
    }

    @Override
    public T remove() throws Exception {
        return removeFirst();
    }

    @Override
    public T element() throws Exception {
        return getFirst();
    }

}
