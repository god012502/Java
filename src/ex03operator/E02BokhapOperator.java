package ex03operator;

public class E02BokhapOperator {

	public static void main(String[] args) {
/*
복합대입연산자
	산술연산자와 대입연산자를 연결해놓은 형태로 좌우측의 값을 연산하여
	좌측의 변수에 대입하는 구조를 가진다. 
	문법의 구조상 현재의 타입을 유지하는 특성을 가지고 있다.
*/		
		double e = 3.1; //3.1
		e += 2.1; //3.1 + 2.1 = 5.2
		e *= 2; //5.2 * 2 = 10.4
		e += e; // 10.4 + 10.4 = 10.8
		
//		변수 e에 모든 연산의 결과가 누적되어 출력됨
		System.out.println("e의 결과 값 : "+e);
		
		int n = 5;
/*
정수와 실수를 연산하면 실수의 결과가 나오므로 n에 대입할 수 없어 에러가 발생한다.
*/		
//		n = n * 2.7;
		
//		결과는 13.5이나 int 강제형변환이 되서 13
		n = (int)(n * 2.7); 
		n *= 2.7;
//		결과는 35.1이나 자동형변환이 되어서 35
		System.out.println("n의 결과 값 : "+ n);
	}
}
