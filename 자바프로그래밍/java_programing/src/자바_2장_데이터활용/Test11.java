package 자바_2장_데이터활용;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 42;
		//String bnum = Integer.toBinaryString(num);
		
		String st = Integer.toHexString(num);
		System.out.println(st);
		
		int f = 12;
		int g =(~f) + 1;
		System.out.println(g);

	}

}
