package chap_04;

public class _10_Break {
	public static void main(String[] args) {
//		치킨집 - 하루 최개 20마리만 판매(1인 1마리)
//		손님은 총 50명 대기
		
//		FOR문
		int max = 20;
		for(int i = 0; i < 50; i++) {
			System.out.println((i+1) + "번째 손님, 주문하신 치킨 나왔습니다.");
			if((i+1) == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		System.out.println("영업을 종료합니다.");
		System.out.println("=============================================");
		
//		WHILE문
		int index = 1;
		while(index <= 50) {
			System.out.println(index + "번째 손님 주문하신 치킨 나왔습니다.");
			if(index == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
			index++;
		}
		System.out.println("영업을 종료합니다.");
		
		
	}
}
