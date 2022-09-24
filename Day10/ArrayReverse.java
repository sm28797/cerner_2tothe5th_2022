//cerner_2^5_2022
//Program to reverse the elements of an array

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
        for(int i=0;i<n/2;i++) {
        	int temp=arr[i];
        	arr[i]=arr[n-i-1];
        	arr[n-i-1]=temp;
        }
        System.out.print("Array in reversed order : ");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
	}
}
