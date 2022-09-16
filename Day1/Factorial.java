//cerner_2^5_2022

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
        int n,factorial=1,i=1;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        while(n!=1){
            factorial=factorial*n;
            n--;
        }
        System.out.print("Factorial of is " + factorial);
	}
}
