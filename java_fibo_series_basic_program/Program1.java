package java_fibo_series_basic_program;

import java.util.Scanner;

public class Program1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number to print Fibonacci Series:");
		int num = sc.nextInt();
		int first = 0;
		int second = 1;
		System.out.print("The Fibonaci Series for the given number "+num+" is: ");
		for(int i=0;i<num;i++) {
			
			System.out.print(first+" ");
			int next = first + second;
			first = second;
			second = next;
			
		}
		
		sc.close();
		
	}

}
