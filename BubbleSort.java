//Bubble sort
package javaArray;

import java.util.Scanner;

public class BubbleSort {
	static void bubble(int[] a) {
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(a[j]<a[j-1]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Enter the elements the array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.print("Array before sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		bubble(a);
		System.out.println("Array after sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		
		
		
		
		


	}

}
