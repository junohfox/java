package edu.test;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상품 가격 167000원을 지불하기 위해 필요한 최소 지폐 장수
		// 천원 미만 할인하고 임의의 금액 지불하는 지폐 장수 구하는 프로그램 작성

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("num:");
		int num = scanner.nextInt();

		int b = (num / 50000); // 3 5만원 나누기
		int c = (num % 50000); // 5만원 나머지17000
		int d = c / 10000; // 나머지를 만원 나누기
		int e = c % 10000; // 만원 나누기 나머지
		int f = e / 5000; // 5천원 몇장
		int g = e % 5000; // 5천원 나누고 나머지
		int h = g / 1000; // 천원 몇장

		System.out.println("5만원:" + b + "장");
		System.out.println("만원:" + d + "장");
		System.out.println("5천원:" + f + "장");
		System.out.println("천원:" + h + "장");

	}

}
