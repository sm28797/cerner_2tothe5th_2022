//cerner_2^5_2022
/* Program to print pyramid pattern shown below -
                      *
                     ***
                    *****
                   *******
                  *********
                   *******
                    *****
                     ***
                      *
*/

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String[] args) {
        int num;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        num=s.nextInt();
        for(int i=1;i<=num/2;i++) {
        	for(int j=i;j<=num/2;j++) 
        		System.out.print(" ");
        	for(int j=1;j<=i;j++)
        		System.out.print("* ");
        	System.out.println();
        }
        for(int i=num/2-1;i>=1;i--) {
        	for(int j=i;j<=num/2;j++) 
        		System.out.print(" ");
        	for(int j=i;j>=1;j--)
        		System.out.print("* ");
        	System.out.println();
        }
        }
}
