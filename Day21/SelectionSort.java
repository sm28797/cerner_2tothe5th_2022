// cerner_2^5_2022
// Program to sort elements of an Array using Selection Sort

import java.util.Scanner;

public class SelectionSort {
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
        	int min_index=i;
        	for(int j=i+1;j<n;j++)
        		if(arr[j]<arr[min_index])
        			min_index=j;
        	int temp=arr[min_index];
        	arr[min_index]=arr[i];
        	arr[i]=temp;
        }
        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
	}
}
