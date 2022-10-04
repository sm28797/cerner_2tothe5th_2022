// cerner_2^5_2022
// Program to sort an array using bubble sort

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
        int n;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements in array : ");
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=1;j<n-i;j++) {
        		if(arr[j-1]>arr[j]) {
        			int temp=arr[j-1];
        			arr[j-1]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
	}
}
