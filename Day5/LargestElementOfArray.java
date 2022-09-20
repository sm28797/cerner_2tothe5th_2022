//cerner_2^5_2022
//Program to find the largest element in an array

import java.util.Scanner;

public class LargestElementOfArray {
	public static void main(String[] args) {
        int n,sum=0,largest;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements in array : ");
        for(int i=0;i<n;i++) {
        	arr[i]=s.nextInt();
        }
        largest=arr[0];
        for(int i=1;i<n;i++) {
        	if(arr[i]>largest)
        		largest=arr[i];
        }
        System.out.print("Largest Element in the Array is "+largest);
	}
}
