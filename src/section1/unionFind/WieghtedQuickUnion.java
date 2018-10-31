package section1.unionFind;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class WieghtedQuickUnion {

    private int[] a;
    private int[] size;
    private int count;

    public WieghtedQuickUnion(int n) {
        this.count = n;
        a = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = i;

        for (int i = 0; i < n; i++) {
            size[i] = 1;
        }
    }

    public int count(){return count;}

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public int find(int n){
        while (n!=a[n])
            n = a[n];

        return n;
    }

    public void union(int p, int q){
        int pId = find(p);
        int qId = find(q);

        if (pId == qId) return;

        if (size[pId] < size[qId]){
            a[pId] = qId;
            size[qId] = size[qId] + size[pId];
        } else {
            a[qId] = pId;
            size[pId] = size[pId] + size[qId];
        }

        count --;
    }

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader("/Users/munna/Downloads/algs4-data/largeUF.txt");
            br = new BufferedReader(fr);
            String sCurrentLine;
            int n = Integer.valueOf(br.readLine());
            WieghtedQuickUnion quickUnion = new WieghtedQuickUnion(n);
            long start = System.currentTimeMillis();
            while ((sCurrentLine = br.readLine()) != null) {
                int p = Integer.valueOf(sCurrentLine.split(" ")[0]);
                int q = Integer.valueOf(sCurrentLine.split(" ")[1]);
                System.out.println("P:" + p + " Q:" + q);
                boolean check = quickUnion.connected(p, q);
                System.out.println("Connected : " + check);
                if (!check) {
                    quickUnion.union(p, q);
                    check = quickUnion.connected(p, q);
                    System.out.println("Connected : " + check);
                }
            }
            System.out.println("Components : " + quickUnion.count());
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
