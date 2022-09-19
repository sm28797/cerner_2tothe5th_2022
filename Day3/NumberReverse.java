//cerner_2^5_2022
//Program to reverse a given number

import java.util.Scanner;
public class NumberReverse {
	public static void main(String[] args) {
        int num,rev=0,n;
        Scanner s = new Scanner(System.in);
        num=s.nextInt();
        while(num!=0) {
        	n=num%10;
        	rev=rev*10+n;
        	num=num/10;
        }
        System.out.print("Reversed number : "+rev);
	}
}
