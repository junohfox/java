package edu.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		//ctrl+ shift o 키 -> 
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("num:");
		int num = scanner.nextInt();
		// TODO Auto-generated method stub
			
			//변수 선언
		int a = 0;
		int b = 0;
		//조건 검색
		for (int i = 1 ; i <= num ; i++) {
			if(i%2==0)
				a += i;
			else
				b +=i;
				
		}
		
		System.out.println("짝수합:" + a);
		System.out.println("홀수합:" + b);
		System.out.println("전체합:" + (a+b));
			
		}
			
	}

