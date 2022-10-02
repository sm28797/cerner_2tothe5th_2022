//cerner_2^5_2022
// Linear search program

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
        int n,flag=0,pos = 0;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements in array : ");
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
        System.out.print("Enter the element to be searched : ");
        int x=s.nextInt();
        for(int i=0;i<n;i++) 
        	if(x==arr[i]) {
        		flag=1;pos=i+1;
        		break;
        	}
        if(flag==1)
        	System.out.print("Element found at position : "+pos);
	}
}
