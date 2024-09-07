package java_fibo_series_basic_program;
import java.util.Scanner;
public class FibonacciSerieswithSum {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to print the Fibonacci Series and his Sum");
		int num = sc.nextInt();
		int sum=0;
		int first=0;
		int second=1;
		System.out.println("This given number "+num+"  fibonacci series is: ");
		for(int i=0;i<num;i++) {
			System.out.print(first+" ");
			sum+=first;
			int next=first+second;
			first=second;
			second=next;
			
		}
		System.out.println();
		System.out.print("The sum of the fibonacci series is: "+sum);
		sc.close();
	}
	

}
