package problem5;

import java.util.Scanner;
 
public class Solution {
 
    private static boolean containsOne(int[] arr) {
        for (int n : arr) {
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
    
    
 
    private static int indexOfOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int i = 0;
        int j = 0;
        while (i < 5) {
            String[] input = scanner.nextLine().split(" ");
            int[] M = new int[input.length];
            for (int k = 0; k < input.length; k++) {
                M[k] = Integer.parseInt(input[k]);
            }
            if (containsOne(M)) {
                j = indexOfOne(M);
                System.out.println(Math.abs(2 - i) + Math.abs(2 - j));
                break;
            }
            i++;
        }
    }
 
}
