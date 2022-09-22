//cerner_2^5_2022
//Program to print the table of a number given by user
import java.util.Scanner;

public class TablePrint {
	public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number to print its table : ");
        n=s.nextInt();
        for(int i=1;i<=10;i++) {
        	System.out.println(n+"*"+i+"="+n*i);
        }
	}
}
