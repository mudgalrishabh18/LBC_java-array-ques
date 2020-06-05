//Print a version of the given array where all the 10's have been removed. 
//The remaining elements should shift left towards the start of the array as needed, 
//and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
//You may modify and display the given array or make a new array.
package javaArray;

import java.util.Scanner;

public class RemoveTen {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array:");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		sc.close();
		//int temp[]=new int[n];
		int t=0;
		for(int i=0;i<n;i++) {
			if(a[i]==10) {
				a[i]=0;
				
					
				
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			
				
				
				
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
