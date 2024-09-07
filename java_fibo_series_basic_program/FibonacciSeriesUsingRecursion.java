package java_fibo_series_basic_program;
import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
	
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number to print the fibonacci series: ");
		int num=sc.nextInt();
		System.out.println("The Fibonacci Series for "+num+" is:");
		for(int i= 0; i<num;i++) {
			System.out.print(fibonacci(i)+ " ");
		}
		sc.close();
	}

}
