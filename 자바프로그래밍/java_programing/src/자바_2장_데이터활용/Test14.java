package 자바_2장_데이터활용;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//32가 증가한다 A= "65" a = "97" 아스키 코드 이므로 대문자와 소문자를 바꿀수 있는 코딩
		char c = 'A';
		int nc = c;
		System.out.println("nc = " + nc);
		c ^= ( 1 << 5);
		System.out.println(c);
		
		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println(max);
		
		byte i = 10;
		byte j = 20;
		
		byte k = (byte) (i + j); //자바에서 덧셈은 int 정수 기반 결과를 만든다
		System.out.println(k);
	}

}
