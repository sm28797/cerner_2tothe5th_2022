// cerner_2^5_2022
// cerner_2tothe5th_2022
// Program to replace Spaces in a string with *

import java.util.Scanner;

public class ReplaceSpaceInString {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string to replace space with * : ");
        String str=s.nextLine();
        char ch;
       	ch='*';
       	str=str.replace(' ', ch);
        System.out.print("String after space replacement is : "+str);
	}
}
