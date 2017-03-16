// author : Vaibhav Jindal

package Assign1;

import java.util.Scanner;

public class Factorial {
	
	// function for calculating factorial
	public static int factorialCalculation(int number){
		if (number == 0){
			return 1;
		}
		
		return number * factorialCalculation(number-1);
	}
	
	public static void main(String[] args) {
		// input number
		System.out.println("enter the number you want to find factorial off : ");
		int number = new Scanner(System.in).nextInt();
		
		// printing out result
		System.out.println("factorial of the "+ number + " is : " + factorialCalculation(number));
	}
}
