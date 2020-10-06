package MyDataStructures;

public interface MyList<T> {
    int size();
    boolean isEmpty();
    boolean isFull();
    void add(T element);
    T remove(int index) throws Exception;
    boolean contains(T dog);
}
