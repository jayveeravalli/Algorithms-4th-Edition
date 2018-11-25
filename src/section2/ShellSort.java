package section2;

import java.util.Arrays;

public class ShellSort implements Sort{

    @Override
    public void sort(Object[] a) {
        int n = a.length;
        int h = 1;
        while (h < n/3)
            h = 3*h + 1;

        while (h!=0) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h; j = j - h) {
                    if (less(a[j - h], a[j])) {
                        a = swap(a, j, j - h);
                    }
                }
            }
            h = h / 3;
        }
    }

}
