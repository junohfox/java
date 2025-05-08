package edu;

public class Test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break 문 사용하여 반복문 제어 가능 
		int cnt = 0;
		while(true) {
			System.out.println("OK");
			cnt = cnt + 2;
			if(cnt ==10) {
				break;
			}
		}
	}

}
