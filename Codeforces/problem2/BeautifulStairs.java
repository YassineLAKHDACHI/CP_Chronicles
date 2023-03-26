import java.util.Scanner;
 
public class BeautifulStairs {
 
	public static void main(String[] args) {
	
 
		int h1 = 1, h2 = 1 ;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		
		for(int i=1 ; i<n ; i++) {
 
			int j = i ;
			int s = j;
			//h2 = i ;
			
			while(s<n) {
				j++ ;
				s += j ;
				h2 = j ;
 
			}
	
			if (s==n) {
				h1=i;
				break;
			}
 
			
		}
		System.out.println(h1+" "+h2);
		
 
	}
 
}