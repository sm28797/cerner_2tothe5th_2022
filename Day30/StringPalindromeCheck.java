// cerner_2^5_2022
// Program to reverse a String

import java.util.Scanner;

public class StringPalindromeCheck {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string to be checked : ");
        String str=s.nextLine();
        String result;
        char arr[]=str.toCharArray();
        int x=str.length()-1;
        for(int i=0;i<str.length()/2;i++) {
        	char temp=arr[i];
        	arr[i]=arr[x];
        	arr[x--]=temp;
        }
        result=String.valueOf(arr);
        if(result.equals(str))
        	System.out.print("String is a palindrome");
        else
            System.out.print("String is not a palindrome");
	}
}
