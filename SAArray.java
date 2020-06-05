package javaArray;

import java.util.Scanner;

public class SAArray {
	public static void main(String args[]) {
		
	
	
	int n,sum=0;
	float avg=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no. of elements you want in array:");
	n = sc.nextInt();
	int[] a=new int[n];
	
	 System.out.println("Enter all the elements:");
     for(int i = 0; i < n; i++)
     {
         a[i] = sc.nextInt();
         sum = sum + a[i];
     }	
     sc.close();
     avg=sum/n;
System.out.println("Sum is "+sum);
System.out.println("average is "+avg);
}
}
