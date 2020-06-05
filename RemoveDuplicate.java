//Write a program to remove the duplicate elements in an array and print the same.
package javaArray;

import java.util.Scanner;

public class RemoveDuplicate {
	static int removeDuplicate(int[] a,int n) {
		if(n==0||n==1) {
			return n;
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
				}
		}
		temp[j++]=a[n-1];
		
		  for (int i=0; i<j; i++){  
	            a[i] = temp[i];  
	        } 
		return j;
		
	}
	
	
	

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
		n=removeDuplicate(a,n);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		
		

	}

}
