package section2;

public class InsertionSort implements Sort {

    @Override
    public void sort(Object[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j - 1], a[j])) {
                    a = swap(a, j, j - 1);
                }
            }
        }
    }

}
