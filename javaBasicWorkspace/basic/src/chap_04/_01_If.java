package chap_04;

public class _01_If {
	public static void main(String[] args) {
//		조건문 if 는 특정 조건이 참(true)일 때만 코드 블록이 실행되는 제어문이다.

		int hour = 9;
		
		if(hour < 10) {
			System.out.println("아이스 아메리카노 +1");
		}
		
//		if 문 내에서 하나의 문장을 실행할 때는 {} 생략 가능
		if(hour < 10) System.out.println("아이스 아메리카노 +1");
		
		if(hour <12) {
			System.out.println("아이스 아메리카노 +1");
			System.out.println("샷 추가");
		}
		System.out.println("커피 주문 완료 #1");
		// 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
		hour = 10;
		boolean morningCoffee = false;
		
		// && : AND 조건 
		if (hour < 14 && !morningCoffee) {				// 모닝커피의 값이 false 이다.
			System.out.println("아이스 아메리카노 +1");
		}
		System.out.println("커피 주문 완료 #2");
		
		// 오후 2시 이후이거나 모닝 커피를 마신 경우?
		hour = 11;
		morningCoffee = true;
		
		// || : OR
		if (hour >= 14 || morningCoffee==true) {		// 모닝커피는 true 이다.
			System.out.println("아이스 아메리카노 (디카페인) +1");
		}
		System.out.println("커피 주문 완료 #3");
	}	
}
