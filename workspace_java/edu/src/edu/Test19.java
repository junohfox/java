package edu;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;
		String result = "";
		// result 변수를 선언해서 "" 빈문자열로 초기화함
		//if ~ else 문
		if (score >= 60) {
			result = "합격";
		} else {
			result = "불합격";
		}

		System.out.println(result);

		System.out.println(score >= 100 ? "합격" : "불합격");
		// 삼항연산자로도 가능하다.
	}

}
