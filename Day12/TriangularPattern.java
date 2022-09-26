//cerner_2^5_2022

/*     Program to print the following pattern
 		*
 		* *
 		* * *
 		* * * *
 		* * * * *
 */
import java.util.Scanner;

public class TriangularPattern {
	public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number of lines you want to print : ");
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}
}
