package section1.dynamicConnectivity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WeightedQuickUnionPathCompression {

    private int count;
    private int[] id;
    private int[] size;

    public WeightedQuickUnionPathCompression(int n){
        this.count = n;
        this.id = new int[n];
        this.size = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    public int getCount(){
        return count;
    }

    public int find(int n){
        int root = n;
        while(root!=id[root]) root = id[root];
        int temp;
        while(n!=root) {
            temp = id[n];
            id[n] = root;
            n = temp;
        }
        return root;
    }

    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){

        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) return;

        int pTreeSize = size[pRoot];
        int qTreeSize = size[qRoot];

        if (qTreeSize > pTreeSize) {
            id[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        } else {
            id[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
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
            WeightedQuickUnionPathCompression quickUnion = new WeightedQuickUnionPathCompression(n);
            long start = System.currentTimeMillis();
            while ((sCurrentLine = br.readLine()) != null) {
                int p = Integer.valueOf(sCurrentLine.split(" ")[0]);
                int q = Integer.valueOf(sCurrentLine.split(" ")[1]);
                System.out.println("P:" + p + " Q:" + q);
                quickUnion.union(p, q);
            }
            System.out.println("Components : " + quickUnion.getCount());
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
