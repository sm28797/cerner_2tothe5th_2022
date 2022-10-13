// cerner_2^5_2022
// Program to change the Vowels with lower case to upper case 

import java.util.Scanner;

public class StringVowelToUpperCase {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string to be changed : ");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
        			str.charAt(i)=='o' || str.charAt(i)=='u')
        		str=str.replace(str.charAt(i), Character.toUpperCase(str.charAt(i)));
        }
        System.out.print("String after changing Vowels to upper case : "+str);
	}
}
