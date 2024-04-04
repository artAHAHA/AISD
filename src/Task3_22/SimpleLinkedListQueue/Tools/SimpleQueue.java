package Task3_22.SimpleLinkedListQueue.Tools;

public interface SimpleQueue<T> {
    void add(T value);

    T remove() throws Exception;

    T element() throws Exception;

    int size();

    default boolean empty() {
        return size() == 0;
    }
}