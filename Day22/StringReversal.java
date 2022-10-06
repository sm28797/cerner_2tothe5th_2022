// cerner_2^5_2022
// Program to reverse the characters of a String

import java.util.Scanner;

public class StringReversal {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string to be reversed : ");
        String str=s.nextLine();
        char arr[]=str.toCharArray();
        int x=str.length()-1;
        for(int i=0;i<str.length()/2;i++) {
        	char temp=arr[i];
        	arr[i]=arr[x];
        	arr[x--]=temp;
        }
        str=String.valueOf(arr);
        System.out.print("Reversed string is : "+str);
	}
}
