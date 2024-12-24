package lab33;


import java.util.HashSet;

public class MySet<T> implements MyCollection<T> {
    private HashSet<T> set = new HashSet<>();

    @Override
    public void add(T element) {
        set.add(element); 
    }

    @Override
    public void remove(T element) {
    	set.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return set.contains(element); 
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty(); 
    }

    @Override
    public void clear() {
        set.clear(); 
    }


}
