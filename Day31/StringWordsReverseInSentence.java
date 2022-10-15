// cerner_2^5_2022
// cerner_2tothe5th_2022
/* Program to reverse the words of a string like - 
 	String - 'Hello I am Ram' will become 'Ram am I Hello'
*/
import java.util.Scanner;

public class StringWordsReverseInSentence {
	public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the string to be reversed : ");
        String str=s.nextLine(),result="";
        String temp[]=str.split(" ");
        for(int i=temp.length-1;i>=0;i--) {
        	result=result.concat(temp[i] + " ");
        }
        System.out.print("Reversed string : "+result);
	}
}
