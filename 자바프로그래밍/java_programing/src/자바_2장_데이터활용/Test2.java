package 자바_2장_데이터활용;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub main 입력후 ctrl + space
		int depositAmount;
		
		depositAmount = 50000;
		
		System.out.println(depositAmount);
		//sysout 입력후 ctrl + space
		int a = 1000;
		//int 정수타입 byte,short,int,long 등등 여기서 byte는 1바이트 int는 4바이트 할당 short 2바이트 long 8바이트 할당
		System.out.println(a);
		
		
		boolean isMarried = false;
		//boolean 1바이트 공간 차지 true or false로 값이 나타남
		
		isMarried = true;
		
		System.out.println(isMarried);
		
		System.out.println("ismarried =" + isMarried);
		
		char gender = 'F';
		//char 문자타입 2바이트 공간 차지 문자는 2바이트 취급 (유니코드)
		System.out.println(gender);
		
		char ch = 'A';
		
		int num = ch;
		
		num = num + 1; //66
		
		ch = (char)num; // ch = num; 이라고 치면 4바이트를 2바이트에 저장할려고 하니 정보손실발생 오류 유발
		//type casting이라고 한다
		System.out.println("\n\tnum = " + ch);
		
		double pi = 3.14;
		//double 실수타입
		System.out.println(pi);
		
		char c = '\u0057';
		// 유니코드 0057 => w char은 문자 한글자만 표현이 가능하다.
		// '\' 특수문자 '\n' => 줄바꿈 (line feed) '\r' 리턴 문자
		System.out.println(c);
		
		
		String greeting = "Good Morning";
		//String 문자타입 큰따옴표로 감싸야함 ★참조 변수(reference) 값은 다른곳에 저장되어있고 그 주소를 불러오는 역할 
		
		System.out.println("\ngreeting");
		System.out.println("\"greeting");
		System.out.println("\"greeting\"");
		
		
	
		

	}
	
	

}
