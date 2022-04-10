package com.gl.q1;

import java.util.Scanner;

public class PayMoney {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int arraySize = sc.nextInt();
		
		int[] array = new int[arraySize];  
		
		System.out.println("Enter the values of array");  
		
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt(); 
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numberOfTargets = sc.nextInt();
		
		for (int j = 0; j < numberOfTargets; j++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			int sum = 0;
			
			for (int k = 0; k < arraySize; k++) {
				sum += array[k];
				if (sum >= target) {
					System.out.println("Target achieved after "+ (k+1) + " transactions");
					break;
				}				
			}
			
			if (sum < target) {
				System.out.println("Given target is not achieved");
			}
			
		}
		sc.close();
	}
}