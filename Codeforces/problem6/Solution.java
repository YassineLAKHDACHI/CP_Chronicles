package problem6;
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String s1 = "", s2 = "";
        int l = 0, u = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                l++;
            }
            else {
                u++;
            }
            s2 += Character.toUpperCase(ch);
            s1 += Character.toLowerCase(ch);
        }
        if(l >= u) {
            System.out.println(s1);
        }
        else if(l < u) {
            System.out.println(s2);
        }
    }
}


