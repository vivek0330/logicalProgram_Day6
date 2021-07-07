package logicalProgram;

import java.util.Scanner;

public class FibonacciProgram {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3;
		Scanner sc = new Scanner(System.in);// getting a value from user
		System.out.print("Enter the number :: ");
		int Count = sc.nextInt();
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (int i = 2; i < Count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
