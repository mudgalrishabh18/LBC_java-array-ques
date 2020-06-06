//Write a program to initialize an array and print them in a sorted order.
package javaArray;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

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
    	for(int i=0;i<n;i++) {
    		System.out.println(a[i]);
 
    	}

	}

}
