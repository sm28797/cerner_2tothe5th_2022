// cerner_2^5_2022
// Program to find the frequency of a given character in a given string


import java.util.Scanner;

public class CharacterFrequencyInString {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=s.nextLine();
        System.out.print("Enter the character to find its frequency in string : ");
        char ch=s.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++) {
        	if(ch==str.charAt(i))
        		count++;
        }
        System.out.print("Frequency of "+ch+" in given string is : "+count);
	}
}
