package section1.dynamicConnectivity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WeightedQuickFind {

    private int[] a;
    private int[] size;
    private int count;

    public WeightedQuickFind(int n) {
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

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader("/Users/munna/Downloads/algs4-data/tinyUF.txt");
            br = new BufferedReader(fr);
            String sCurrentLine;
            int n = Integer.valueOf(br.readLine());
            WeightedQuickFind weightedQuickFind = new WeightedQuickFind(n);
            long start = System.currentTimeMillis();
            while ((sCurrentLine = br.readLine()) != null) {
                int p = Integer.valueOf(sCurrentLine.split(" ")[0]);
                int q = Integer.valueOf(sCurrentLine.split(" ")[1]);
                System.out.println("P:" + p + " Q:" + q);
                boolean check = weightedQuickFind.isConnected(p,q);
                System.out.println("Connected : " + check);
                if (!check) {
                    weightedQuickFind.union(p, q);
                    check = weightedQuickFind.isConnected(p, q);
                    System.out.println("Connected : " + check);
                }
            }
            System.out.println("Components : " + weightedQuickFind.count());
            long end = System.currentTimeMillis();
            System.out.println("Time : " + (end - start) / 1000L);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
}
