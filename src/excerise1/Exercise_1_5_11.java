package excerise1;

public class Exercise_1_5_11 {


    private int[] a;
    private int[] size;
    private int count;

    public Exercise_1_5_11(int n) {
        this.a = new int[n];
        this.size = new int[n];
        this.count = n;

        for (int i = 0; i < n; i++) {
            a[i] = i;
            size[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    public int find(int n) {
        return a[n];
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        if (isConnected(p, q)) return;

        int pRoot = find(p);
        int qRoot = find(q);
        int pRootSize = size[pRoot];
        int qRootSize = size[qRoot];

        if (pRootSize > qRootSize) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == qRoot) {
                    a[i] = pRoot;
                }
            }
            size[pRoot] += size[qRoot];
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == pRoot) {
                    a[i] = qRoot;
                }
            }
            size[qRoot] += size[pRoot];
        }
        count--;
    }

}
