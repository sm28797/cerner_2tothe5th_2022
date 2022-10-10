// cerner_2^5_2022
// Program to concatenate/join two strings

import java.util.Scanner;

public class ConcatenateTwoStrings {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1=s.nextLine();
        System.out.print("Enter the second string : ");
        String str2=s.nextLine();
        str1=str1+(" ")+str2;
        System.out.print(str1);
	}
}
