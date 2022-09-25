//cerner_2^5_2022
//Swap 2 numbers without using any extra variable

import java.util.Scanner;

public class SwappingNumber {
	public static void main(String[] args) {
        int a,b;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the 2 numbers : a = ");
        a=s.nextInt();
        System.out.print("b = ");
        b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("The numbers after swapping are : a = "+a+" b = "+b);
	}
}
