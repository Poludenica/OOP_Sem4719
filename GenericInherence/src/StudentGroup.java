import java.util.Iterator;
import java.util.List;

/**
 * Класс описывает группу. Содержит список учеников,номер группы и колличество
 * учеников
 */
public class StudentGroup<T extends Comparable<T>,V> implements Iterable<Student<T,V>>, Comparable<StudentGroup<T,V>> {
    private List<Student<T,V>> group;
    private V idGroup;
    private V groupSize;

    public StudentGroup(List<Student<T,V>> group, V idGroup, V groupSize) {
        this.group = group;
        this.idGroup = idGroup;
        this.groupSize = group.size();
    }

    public List<Student<T,V>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<T,V>> group) {
        this.group = group;
    }

    public V getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(V idGroup) {
        this.idGroup = idGroup;
    }

    public V getGroupSize() {
        return groupSize;
    }

    /**
     * Вывозит информацию о группе (Номер группы, колличество учеников)
     */
    @Override
    public String toString() {
        String studentsOut = "\u001B[32mStudentGroup = " + idGroup + ", Колличество учеников = " + groupSize
                + "\u001B[0m\n";
        for (Student<T,V> student : group) {
            studentsOut += student + "\n";

        }
        return studentsOut;
    }

    @Override
    public Iterator<Student<T,V>> iterator() {
        return new StudentIterator<T,V>(group);
    }

    @Override
    public int compareTo(StudentGroup<T,V> o) {
        if (this.idGroup == o.idGroup) {
            return 0;
        } else if (this.idGroup > o.idGroup) {
            return 1;
        } else
            return -1;
    }

}