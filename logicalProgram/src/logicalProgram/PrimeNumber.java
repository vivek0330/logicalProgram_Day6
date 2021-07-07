package logicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	static void myMethod(int num) {

		int temp = 0;

		if (num == 1 || num == 0) {
			System.out.println("not prime");
		} else {
			for (int i = 2; i <= num - 1; i++) {
				if (num % i == 0) {
					temp++;
				}
			}
			if (temp == 0) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :: ");
		int num = sc.nextInt();
		myMethod(num);
		sc.close();
	}

}
