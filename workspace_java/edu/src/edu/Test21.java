package edu;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 2;
		char op = '+';
		
		if(op == '+') {
			System.out.println(a + b);
		} else if (op == '-') {
			System.out.println(a -b);
		} else if (op == '*') {
			System.out.println(a * b);
		} else if (op == '/') {
			System.out.println(a / b);
		}
		
		switch(op) {
		case '+':
			System.out.println(a+b); 
		case '-':
			System.out.println(a-b); 
		case '*':
			System.out.println(a*b); break;
		case '/':
			System.out.println(a/b);
			
		//switch case 문 if~else if 문은 여러개 조건을 지정해줘야 하는 반면 switch case 문은 조건식 지정을 한번만 하고 코딩을 작성가능
		//break : 연산을 끝내고 괄호 밖으로 빠져나가게 하는 기능
		}
	}

}
