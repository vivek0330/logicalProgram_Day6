package logicalProgram;

import java.util.Scanner;

public class PerfectNumber {

	static void myMethod() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		int NUMBER = sc.nextInt();
		sc.close();

		for (int i = 1; i < NUMBER; i++) {
			if (NUMBER % i == 0) {
				sum += i;
				// System.out.println("SUM :: " + sum);
			}
		}
		if (NUMBER == sum) {
			System.out.println("Number is perfect number !!!");
		} else {
			System.out.println("Number is not perfect number !!!");
		}
	}

	public static void main(String[] args) {
		myMethod();
	}
}
