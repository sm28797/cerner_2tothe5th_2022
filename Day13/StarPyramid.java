//cerner_2^5_2022
/* Program to print the below pyramid pattern using * - 
                          * 
                         * * 
                        * * * 
                       * * * * 
                      * * * * *       
*/
import java.util.Scanner;

public class StarPyramid {
	public static void main(String[] args) {
        int num;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        num=s.nextInt();
        for(int i=1;i<=num;i++) {
        	for(int j=i;j<=num;j++) 
        		System.out.print(" ");
        	for(int j=1;j<=i;j++)
        		System.out.print("* ");
        	System.out.println();
        }
	}
}
