// cerner_2^5_2022
// Program to check whether brackets  <>()[]{} in a string are balanced or not 

import java.util.Arrays;
import java.util.Scanner;

public class StringBalancedBrackets {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string to be checked : ");
        String str=s.nextLine();
        char bracket[]= {'(',')','{','}','<','>','[',']'};
        int count[]= new int [4],flag=0;
        Arrays.fill(count, 0);
        for(int i=0;i<str.length();i++) {
        	for(int j=0;j<8;j++) {
        		if(str.charAt(i)==bracket[j] && j%2==0)
        			count[j/2]++;
        		if(str.charAt(i)==bracket[j] && j%2!=0)
        			count[j/2]--;
        	}
        }
        for(int i=0;i<4;i++)
        	if(count[i]!=0)
        		flag=1;
        if(flag==0)
        	System.out.print("Brackets in given string are balanced");
        else
        	System.out.print("Brackets in given string are not balanced");
	}
}
