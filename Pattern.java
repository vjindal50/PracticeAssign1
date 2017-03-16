// author : Vaibhav Jindal

package Assign1;

import java.util.Scanner;

public class Pattern {
	
	// function to draw the pyramid pattern
	public static void patternDraw(int height){
		for (int i = 1 ; i <= height ; i ++){
			// print out the spaces
			for (int j = height - 1 ; j>=i ; j-- ){
				System.out.print(" ");
			}
			// print out the numbers
			for( int k = 0 ; k < i ; k++){
				System.out.print(k+1 + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// intput the height of pyramid
		System.out.println("enter the height of pyramid between 1 to 10 : ");
		int height = new Scanner(System.in).nextInt();	
		
		// calling draw function to draw pyramid
		patternDraw(height);
	}
}
