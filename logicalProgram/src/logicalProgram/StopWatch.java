package logicalProgram;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Start timing the timer
		System.out.print("Enter 1 to start the clock :: ");
		double start = sc.nextDouble();
		start = System.currentTimeMillis();
		System.out.println(start);

		// Stop timing the timer
		System.out.print("Enter 0 to stop the clock :: ");
		double stop = sc.nextDouble();
		stop = System.currentTimeMillis();
		System.out.println(stop);

		// Convert to second and displaying
		double elapsed_time = (stop - start) / 100;
		System.out.println("Elapsed time is " + elapsed_time + " seconds ");
		sc.close();
	}
}
