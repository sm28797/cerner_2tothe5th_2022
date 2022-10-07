// cerner_2^5_2022
// Program to find the total number of vowels in an input String

import java.util.Scanner;

public class StringVowelCount {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int vowelCount=0;
        System.out.print("Enter the string : ");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++) {
        	char tmp=str.charAt(i);
        	if(tmp=='a' || tmp=='e' || tmp=='i' || tmp=='o' || tmp=='u')
        		vowelCount++;
        }
        System.out.print("Total no. of vowels in array are : "+vowelCount);
	}
}
