package section1.dynamicConnectivity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class QuickUnion {

    private int count;
    private int[] a;

    public QuickUnion(int n) {
        this.count = n;
        this.a = new int[n];

        for (int i = 0; i < n ; i++){
            a[i] = i;
        }
    }

    public int count(){
        return count;
    }

    public int find(int n){
        while (n != a[n]) n = a[n];
        return n;
    }

    public void union(int p, int q){
        if (connected(p, q)) return;

        int pId = find(p);
        int qId = find(q);
        a[pId] = qId;
        count--;
        System.out.println(Arrays.toString(a));
    }

    public boolean connected(int p, int q){
        int pId = find(p);
        int qId = find(q);

        if (pId == qId)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader("/Users/munna/Downloads/algs4-data/tinyUF.txt");
            br = new BufferedReader(fr);
            String sCurrentLine;
            int n = Integer.valueOf(br.readLine());
            QuickUnion quickUnion = new QuickUnion(n);
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
