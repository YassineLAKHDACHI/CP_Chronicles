import java.io.*;
import java.util.*;
 
public class Main {
    static int[] parent;
 
    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
 
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;
 
        for (int i = 0; i < m; i++) {
            line = br.readLine().split(" ");
            int u = Integer.parseInt(line[0]);
            int v = Integer.parseInt(line[1]);
            parent[find(u)] = find(v);
        }
 
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (parent[i] == i) count++;
        }
 
        System.out.println(count - 1);
    }
}