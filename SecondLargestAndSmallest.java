//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
package javaArray;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array:");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
    	Arrays.sort(a);
    
		System.out.println("two smallest nuber are:"+a[0]+"and"+a[1]);
		System.out.println("two largest number are:"+a[n-2]+"and"+a[n-1]);
		
	}

}
