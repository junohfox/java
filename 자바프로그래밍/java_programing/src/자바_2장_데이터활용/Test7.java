package 자바_2장_데이터활용;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b,c;
		
		b = a++;
		c = ++a;
		System.out.println("a=" +a + ",b =" + b + ", c =" + c);
		
		int num = -a; //negation 연산자
		
		System.out.println("num=" + num);
		
		short snum = 10;
		short anum = (short) -snum; //negation 연산 결과는 int 숫자
		
		boolean isOn =false;
		boolean result = !isOn; //부정연산자
		
	}

}
