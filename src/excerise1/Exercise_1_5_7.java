package excerise1;

public class Exercise_1_5_7 {


    private int n;
    private int[] a;

    public Exercise_1_5_7(int size) {
        this.n = size;
        this.a = new int[n];
        for (int i = 0; i < size; i++) {
            this.a[i] = i;
        }
    }

    public int count(){
        return n;
    }

    public int find(int number){
        return a[number];
    }

    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){
        if (isConnected(p, q)) return;

        int pRoot = find(p);
        int qRoot = find(q);

        for (int i = 0; i < a.length; i++){
            if (a[i] == pRoot){
                a[i] = qRoot;
            }
        }
        n--;
    }

}

