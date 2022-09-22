//cerner_2^5_2022
//Program to check whether a given number is Even or Odd

import java.util.Scanner;

public class EvenOddCheck {
	public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number to be checked : ");
        n=s.nextInt();
        if(n%2==0)
        	System.out.print("Even Number");
        else
        	System.out.print("Odd Number");
	}
}
