// cerner_2^5_2022
// Program to change the case of every alphabet of String

import java.util.Scanner;

public class StringCaseChange {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=s.nextLine();
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++) {
        	if(Character.isUpperCase(arr[i]))
        		arr[i]=Character.toLowerCase(arr[i]);
        	else
        		arr[i]=Character.toUpperCase(arr[i]);
        }
        String op=new String(arr);
        System.out.print("String after change of case is : "+op);
	}
}
