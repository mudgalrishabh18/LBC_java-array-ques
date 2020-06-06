//Write a program to initialize an integer array with values and check if a given number is present in the array or not.

//If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

package javaArray;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		int n,x,x1=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements you want tyo enter the array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the element you want to search:");
		x=sc.nextInt();
		sc.close();
		for(i=0;i<n;i++) {
			if(a[i]==x) {
				x1=x;
				break;
				//i1=i;
				
			}
		}
		if(x1==x) {
			System.out.println("Element is found at index "+(i+1));
			
		}else {
			System.out.println("-1:Not found");
			
		}
	}
}
