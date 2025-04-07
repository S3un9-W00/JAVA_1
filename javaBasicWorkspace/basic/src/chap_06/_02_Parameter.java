package chap_06;

public class _02_Parameter {
	public static void power(int number) {
		int result = number * number;
		System.out.println(number + "의 2제곱은 " + result);
	}
	
//	전달값이 2개인 메소드
	public static void powerByExp(int number, int exponent) {
		int result = 1;
		
		for(int i = 0; i < exponent; i++) {
			result = result * number;
		}
		System.out.println(number + "의 " + exponent + "제곱은 " + result);
	}
	
//	파라미터(Parameter) : 메소드 정의 시 입력값을 받을 변수 (number, exponent)
//	아규먼트(Argument) : 메소드를 호출 할 때 실제로 전달하는 값 (7, 4, 2, 3, ...)
	
	
	public static void main(String[] args) {
		power(7);
		power(4);
		
		powerByExp(2, 3);
		powerByExp(3, 8);
		powerByExp(10, 0);
	}
}
