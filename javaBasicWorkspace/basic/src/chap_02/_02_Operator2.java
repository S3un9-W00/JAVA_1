package chap_02;

public class _02_Operator2 {
	public static void main(String[] args) {
		// 대입연산자 (=) -> 변수에 값을 저장하는 기본적인 연산자, 오른쪽의 값을 왼쪽에 넣어주는.
		int num = 10;
		num = num + 2;
		System.out.println(num);	// 12
		
		num = num - 2;
		System.out.println(num);	// 10
		
		num = num * 2;
		System.out.println(num);	// 20
		
		num = num / 2;
		System.out.println(num);	// 10
		
		num = num % 2;
		System.out.println(num);	// 0
		
		// 복합 대입연산자 -> 위의 기본 산술연산을 조금 더 간결하게 코드로 작성하는 방법
		num = 10;
		num += 2;	// num  num + 12;
		System.out.println(num);
		
		num -= 2;	// num  num + 10;
		System.out.println(num);
		
		num *= 2;	// num  num + 20;
		System.out.println(num);
		
		num /= 2;	// num  num + 10;
		System.out.println(num);
		
		num %= 2;	// num  num + 0;
		System.out.println(num);
	}
}
