package lab33;

public interface MyCollection<T> {
    void add(T element);

    void remove(T element);

    boolean contains(T element);

    int size();

    boolean isEmpty();

    void clear();
    
}
