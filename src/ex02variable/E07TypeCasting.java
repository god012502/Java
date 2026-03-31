package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {

		byte b1 = 65;
		short s1;
		s1 = b1;
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1);
		
		int num1 = b1+s1;
		System.out.println("num1은 "+num1);
		
//		char ch1 = b1;
		char ch2 = (char)b1;
		System.out.println("b1 = "+b1+", ch2 = "+ch2);
		
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("데이터미손실"
				+ ""
				+ ""
				+ ""
				+ "");
		
		

	}

}
