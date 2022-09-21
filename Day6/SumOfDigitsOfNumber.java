//cerner_2^5_2022
//Program to find sum of Digits of a number

import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
        int n;
        System.out.print("Enert the number to find sum of its digits : ");
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        int num=n,sum=0;
        while(num!=0) {
        	sum=sum+(num%10);
        	num=num/10;
        }
        System.out.print("Sum of digits of given number is : "+sum);
	}
}
