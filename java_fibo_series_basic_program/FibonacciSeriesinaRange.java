package java_fibo_series_basic_program;

import java.util.Scanner;

public class FibonacciSeriesinaRange {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number to print Fibonacci Series in range:");
		System.out.println("please enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("please enter the Second number: ");
		int num2 = sc.nextInt();
		int first = 0;
		int second = 1;
		if(num2<=num1){
			System.out.println("The given number is in Not valid or The fist number should be less than second number");	
		}	
		else {
		System.out.print("The Fibonaci Series for the given number "+num1+" to "+num2+" is: ");
		}
		while(first<=num2) {
			if(first>=num1) {
				System.out.print(first+" ");
			}
		
			int next = first + second;
			first = second;
			second = next;
		}
		

			
			
		
		
		sc.close();
		
	}

}
