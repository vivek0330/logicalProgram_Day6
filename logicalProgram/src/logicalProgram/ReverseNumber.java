package logicalProgram;

import java.util.Scanner;

public class ReverseNumber {
	
	static void myMethod(int num1) {

		int reversenum = 0;
		while (num1 != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num1 % 10;
			num1 = num1 / 10;
		}

		System.out.println("Reverse of specified number is: " + reversenum);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :: ");
		int num1 = sc.nextInt();
		myMethod(num1);
		sc.close();
	}	
}
