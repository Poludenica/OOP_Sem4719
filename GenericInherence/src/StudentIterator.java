import java.util.Iterator;
import java.util.List;

/**
 * Итератор для класса StudentGroup 
 */
public class StudentIterator<T extends Comparable<T>, V> implements Iterator<Student<T,V>> {
    private int count;
    private List<Student<T,V>> group;

    public StudentIterator(List<Student<T,V>> group) {
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return count < group.size();
    }

    @Override
    public Student<T,V> next() {
        // count++;
        return group.get(count - 1);
    }

}