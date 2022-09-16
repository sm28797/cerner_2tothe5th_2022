//cerner_2^5_2022
//Program to check whether a number is prime or not

import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
        int n,flag=0;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        if(n==1 || n==2)
        	flag=1;
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0) {
        		flag=1;break;
        	}
        }
        if(flag==0)
        	System.out.print("Prime number");
        else
        	System.out.print("Not a Prime number");
	}
}
