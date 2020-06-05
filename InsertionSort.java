//Insertion Sort
package javaArray;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array:");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(a[j]<a[j-1]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		 for (int i = 0; i < n; i++) {
		     System.out.print(a[i]+",");
		   }

	}

}
