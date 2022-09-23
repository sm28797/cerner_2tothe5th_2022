//cerner_2^5_2022
//Program to print Fibonacci series until the specified number

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number to find fibonacci number : ");
        n=s.nextInt();
        int a=0,b=1,sum=0;
        System.out.print("Fibonacci series : "+a+" "+b+" ");
        for(int i=1;i<=n-2;i++) {
        	sum=a+b;
        	a=b;
        	b=sum;
        	System.out.print(b+" ");
        }
	}
}
