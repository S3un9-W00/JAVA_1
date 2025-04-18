package chap_04;

public class _02_Else {
	public static void main(String[] args) {
//		if-else 문은 조건이 참일 때와 거짓일 때 실행할 코드를 각각 분리하여 작성할 수 있는 조건문이다.
		
		int hour = 11;
		
//		if 와 else 도 실행문이 1개인 경우 {} 생략이 가능하다.
		if (hour < 14) System.out.println("아이스 아메리카노 +1");
		else System.out.println("아이스 아메리카노 (디카페인) +1");
		
		System.out.println("커피 주문 완료 #1");
		
//		오후 2시 이후이거나 모닝커피를 마신 경우?
		hour = 10;
		boolean morningCoffee = false;
		
		if (hour >= 14 || morningCoffee) {
			System.out.println("아이스 아메리카노 (디카페인) +1");
		} else { // 두 조건 모두 거짓일 때 실행 됨.
			System.out.println("아이스 아메리카노 +1");
		}
		System.out.println("커피 주문 완료 #2");
	}
}
