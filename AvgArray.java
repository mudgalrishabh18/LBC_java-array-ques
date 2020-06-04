//Write a program to initialize an integer array and print the sum and average of the array.
package javaArray;

public class AvgArray {
	int[] a= {1,2,3,4,5};
	
	int sum=0;
	float avg=0;
	
	int sumOfArray() {
		for(int i=0;i<=a.length;i++) {
			sum=sum+i;
			
			
		}
		//System.out.println(sum);
		return sum;
		
	}
	float avg() {
		avg=sum/a.length;
		return avg;
		
	}
	
	public static void main(String[] args) {
		AvgArray obj=new AvgArray();
		
		System.out.println("Sum of elements in th array is "+obj.sumOfArray());
		System.out.println("Average of elemnts in th array is "+obj.avg());
		
	
	

	}

}
