//cerner_2^5_2022
//Program to find sum of elements in an array

import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
        int n,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements in array : ");
        for(int i=0;i<n;i++) {
        	arr[i]=s.nextInt();
        	sum=sum+arr[i];
        }
        System.out.println("Sum of elements of array is "+sum);
	}
}
