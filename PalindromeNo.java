// author : Vaibhav Jindal

package Assign1;

import java.util.Scanner;

public class PalindromeNo {
	
	public static void checkPalindrome(int number){
		int r; //to get remainder from mod
		int temp; // temp variable to create a copy of original number
		int numberReversed = 0;
		
		//creating a copy of original number
		temp = number;
		while (number > 0 ){ 
			 r  = number%10; // gives remainder
			 numberReversed = (numberReversed * 10) + r ; 
			 number = number / 10;
		}
		
		if(temp == numberReversed){
			System.out.println("The number " + temp + " is a palindrome");
		}
		else {
			System.out.println("The number " + temp + " is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		// input number
		System.out.println("enter the number you want to check is a palindrome or not : ");
		int number = new Scanner(System.in).nextInt();
		
		//calling checkPalindrome function
		checkPalindrome(number);

	}
}
