package problem7;
import java.util.Scanner;

public class Solution {
   
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t-- > 0) {
      int n = scanner.nextInt();
      int x = scanner.nextInt();
      int f = 0;
      while (n > f * x + 2) {
        f++;
      }
      System.out.println(f + 1);
    }
    scanner.close();
  }
}
