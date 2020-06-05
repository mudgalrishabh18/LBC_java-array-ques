//Write a program to initialize an integer array and find the maximum and minimum value of the array.
package javaArray;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int n,ma,mi;
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter number of elements in the array: ");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		ma=a[0];
		for(int i=0;i<n;i++) {
			 if(a[i]>ma) {
				 ma=a[i];
			 }
		 }
		mi=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<mi) {
				mi=a[i];
			}
		}
		System.out.println("Max is "+ma);
		System.out.println("Min is "+mi);
		
	

	}

}
