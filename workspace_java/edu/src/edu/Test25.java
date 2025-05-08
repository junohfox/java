package edu;

public class Test25 {

	private static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println("\n2");
		System.out.println("\t3");
		System.out.println("\r4");
		System.out.println("\f5");
		System.out.println("\\6");
		System.out.println("\'7");
		System.out.println("\"8");
		System.out.println("\b9");
		System.out.println(10);
		System.out.println(11);
		
		
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		
		for(int i =10; i >0; i--) {
			System.out.println(i);
		}
		for(int i = 1; i <=10; i++) {
			sum += i;
			System.out.println(sum);
		}
		for(int i =2; i<=10; i = i+2) {
			System.out.println(i);
		}
	}
	
	
}
