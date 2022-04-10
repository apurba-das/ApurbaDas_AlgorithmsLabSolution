package com.gl.q2;

import java.util.Scanner;

public class Currency {
	
	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++ ) {
			for (int j = 0; j < n-i-1; j++ ) {
				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int denominationSize = sc.nextInt();
		
		int[] denominationsArray = new int[denominationSize];  
		int[] denominationsCount = new int[denominationSize];
		
		System.out.println("Enter the currency denominations value");  
		
		for (int i = 0; i < denominationSize; i++) {
			denominationsArray[i] = sc.nextInt(); 
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		denominationsArray = bubbleSort(denominationsArray); 
		
		try {
			for (int i = 0; i < denominationSize; i++) {
	            if (amount >= denominationsArray[i]) {
	            	denominationsCount[i] = amount / denominationsArray[i];
	                amount = amount - (denominationsCount[i] * denominationsArray[i]);
	            }
	        }
			if (amount > 0) {
				System.out.println("Exact amount cannot be paid with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < denominationSize; i++) {
					if (denominationsCount[i] > 0) {
						System.out.println(denominationsArray[i] + ":" + denominationsCount[i]);
					}
	            }
	        }
		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
		
		sc.close();
	}
}
