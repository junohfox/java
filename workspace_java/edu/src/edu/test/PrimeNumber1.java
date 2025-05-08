package edu.test;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Number[0:exit]:");
			int num = sc.nextInt();
			if (num == 0)
				break;
			if (isPrime(num) == true)
				System.out.println(num + "is a Prime.");
			else
				System.out.println(num + "is not a Prime");
		}
		sc.close();
		System.out.println("Done!");
	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;

	}

}
