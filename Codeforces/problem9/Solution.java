package problem9;
import java.util.* ;

public class Solution {

    public static int triplet_min_product(int[] a){
        int n = a.length  ;
        Arrays.sort(a);
        return Integer.min(a[0]*a[n-1]*a[n-2] , a[0]*a[1]*a[2]);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        scanner.nextLine();
        String[] myArray = scanner.nextLine().split(" ");
        for(int i=0; i<n ; i++){
            array[i] = Integer.parseInt(myArray[i]);
        }
        scanner.close();
        System.out.println(triplet_min_product(array));
    }
}
