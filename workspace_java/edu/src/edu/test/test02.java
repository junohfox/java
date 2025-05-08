package edu.test;

import java.util.Scanner;

public class test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 입력 하고
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("num:");
		int num = scanner.nextInt();
		
		Scanner dscanner = new Scanner(System.in);
		System.out.print("fnum:");
		int fnum = dscanner.nextInt();
		
		
		for(int i =num; i <= fnum; i ++) {
			for (int j =1; j<10; j++) {
				System.out.println(i  + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}

}
