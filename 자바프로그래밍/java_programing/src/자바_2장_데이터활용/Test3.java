package 자바_2장_데이터활용;

public class Test3 {
	public static void main(String[] args) {
		
		// long d = 21474832648; 오류 메세지 int로 표현할 수 없는 범위 단순 숫자는 int
		//L은 long int
		
		long d = 21474832648L;
		//변수 d에 저장하기 전에 임시 메모리에 저장을 하는데 그 저장타입이 int라서 그럼
		
		System.out.println(d);
		
		
		//  float exchangeRate = 1136.50; 오류가 나타남 메모리에 저장할 시 double 타입으로 저장하기때문 (인식) 
		float exchangeRate = 1136.50F;
		
		//실수를 float 타입으로 처리하려면 숫자끝에 f나 F를 붙이면 된다
		
		System.out.println(exchangeRate);
		
		String name = "Amy";
		String greet = "Hello, how are you! I am fine";
		
		System.out.println("greet의 길이 = " + greet.length());
		System.out.println("greet 변수 길이 = " + greet.getBytes().length);
		
		int A1 = 10;
		int A2 = 20;
		int A3 = A1 + A2;
		
		System.out.println(A3);
		
		
		
		
		
		
	}
	
}
