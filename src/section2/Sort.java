package section2;

public interface Sort {

    public default boolean less(Object obj1, Object obj2){
        return ((Comparable) obj2).compareTo(obj1) < 0;
    }

    public default Object[] swap (Object[] a, int i, int j){
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

    public void sort(Object[] a);
}
