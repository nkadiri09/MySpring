package com.naren.practice;

import java.util.Scanner;

public class Febo {

	public void fonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FibooNacci  Serice: ");
		int n = sc.nextInt();

		int a = 0, b = 0, c = 1;
		for (int i = 0; i < n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println("  " + a);

		}

	}

}
