package chap_04;

public class _11_Continue {
	public static void main(String[] args) {
//		continue문은 반복문 내에서 사용되며, 현재 반복을 중단하고 다음 반복으로 넘어간다.
//		조건에 따라 특정 경우만 건너뛰고, 나머지 반복은 그대로 진행할 때 사용한다.
		
//		치킨집 - 노쇼 손님 처리
		
		int max= 20;
		int sold = 0;
		int noShow = 17;
		
//		FOR문
		for (int i=1; i<=50; i++) {
			System.out.println(i + "번째 손님, 주문하신 치킨 나왔습니다.");
			
			if (i == noShow) {
				System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
				continue;
			}
			
			sold++;
			if (sold == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		System.out.println("영업을 종료합니다.");
		
		
		
		
//		WHILE문
		sold = 0;
		int index = 0;
		
		
		// 무한루프
		while (true) {
			index++;			// index 값 = 1
			System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
			
			if (index == noShow) {
				System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
				continue;
			}
			
			sold++;
			if (sold == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		System.out.println("영업을 종료합니다.");
	}
}
