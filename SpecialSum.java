package javaArray;

import java.util.Scanner;

public class SpecialSum {

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
		int sum=0;
		
		outer:
			for (int i = 0; i < n; i++) {
			    if (a[i] == 6) {
			        for (int j = i + 1; j < n; j++) {
			            if (a[j] == 7) {
			                i = j;
			                continue outer;
			            }
			        }
			    }
			    sum += a[i];
			}
		System.out.println(sum);

	}

}
