package edu;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// is ~ else if 조건문 다음 부정 하고 다시 조건문을 쓸떄 사용
		int score = 50;
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println(grade);

	}

}
