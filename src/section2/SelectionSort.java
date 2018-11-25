package section2;

/**
 *
 * On every iteration we will pick the least element and swap it with the current position
 *
 */

public class SelectionSort implements Sort {

    @Override
    public void sort(Object a[]){
        for (int i = 0; i < a.length; i++){
            int minPos = i;
            for (int j = i+1; j < a.length; j++){
                if (less(a[minPos], a[j])){
                    minPos = j;
                }
            }
            a = swap(a, i, minPos);
        }
    }

}
