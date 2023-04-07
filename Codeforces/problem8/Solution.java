package problem8;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            boolean symmetric = false;
            for (int i = 0; i < n; i++) {
                int tl = input.nextInt();
                int tr = input.nextInt();
                int bl = input.nextInt();
                int br = input.nextInt();
                if (tr == bl) {
                    symmetric = true;
                }
            }
            if (m % 2 == 0 && symmetric) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}

