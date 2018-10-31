package section1.unionFind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuickFind {

    /***
     *
     * Two sites are connected if they both have the same id
     *
     * When we connect two sites we make sure the id of the first number is same as
     * the id of second number.
     *
     * In this implementation find is faster than union as in union we need to
     * check all the elements for id of the arg1 and change it to the id of arg2
     *
     * arg1 and arg2 are p and q.
     */

    private int count;
    private int[] a;

    public QuickFind(int n) {
        this.count = n;
        this.a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public int find(int n) {
        return a[n];
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == pId) {
                a[i] = qId;
            }
        }

        count--;
    }

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader("/Users/munna/Downloads/algs4-data/largeUF.txt");
            br = new BufferedReader(fr);
            String sCurrentLine;
            int n = Integer.valueOf(br.readLine());
            QuickFind quickFind = new QuickFind(n);
            long start = System.currentTimeMillis();
            while ((sCurrentLine = br.readLine()) != null) {
                int p = Integer.valueOf(sCurrentLine.split(" ")[0]);
                int q = Integer.valueOf(sCurrentLine.split(" ")[1]);
                System.out.println("P:" + p + " Q:" + q);
                boolean check = quickFind.connected(p, q);
                System.out.println("Connected : " + check);
                if (!check) {
                    quickFind.union(p, q);
                    check = quickFind.connected(p, q);
                    System.out.println("Connected : " + check);
                }
            }
            System.out.println("Components : " + quickFind.count());
            long end = System.currentTimeMillis();
            System.out.println("Time : " + (end-start)/1000L);
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
