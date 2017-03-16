// author : Vaibhav Jindal

package Assign1;

import java.util.Scanner;

public class Fibonacci {
	
	//program for Fibonacci number using recursion.
		public static int fibonacciRecusion(int number) {
			if (number == 1){
				return 0;
			}			
			if (number == 2 || number == 3) {
				return 1;
			}
			
	 		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
		}
			 
		private static void log(String number) {
			System.out.println(number);
		}
		
		public static void main(String args[]) {			 
			// input to print Fibonacci series upto how many numbers
			log("Enter number upto which Fibonacci series to print: ");
			int number = new Scanner(System.in).nextInt();
	 
			log("\n Using Recursion. Provided Number: " + number);
			// printing Fibonacci series upto number
			for (int i = 1; i <= number; i++) {
				log(fibonacciRecusion(i) + " ");
			}
		}
}

