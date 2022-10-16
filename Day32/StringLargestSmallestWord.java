// cerner_2^5_2022
// cerner_2tothe5th_2022
// Program to find the the smallest and largest word in an input string

import java.util.Scanner;

public class StringLargestSmallestWord {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string to be checked : ");
        String str=s.nextLine();
        String temp[]=str.split(" "), largest="", smallest="";
        int large=0, small=1000;
        for(int i=temp.length-1;i>=0;i--) {
        	if(temp[i].length()>large) {
        		large=temp[i].length();
        		largest=temp[i];
        	}
        	if(temp[i].length()<small) {
        		small=temp[i].length();
        		smallest=temp[i];
        	}
        }
        System.out.println("Smallest word in string : "+smallest);
        System.out.print("Smallest word in string : "+largest);
	}
}
