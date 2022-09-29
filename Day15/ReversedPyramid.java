//cerner_2^5_2022
/* Program to print below pattern - 
                       * * * * * 
                        * * * * 
                         * * * 
                          * * 
                           * 
*/
import java.util.Scanner;

public class ReversedPyramid {
	public static void main(String[] args) {
        int num;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        num=s.nextInt();
        for(int i=1;i<=num;i++) {
        	for(int j=1;j<=i;j++)
        		System.out.print(" ");
        	for(int j=1;j<=num-i+1;j++)
        		System.out.print("* ");
        	System.out.println();
        }
	}
}
