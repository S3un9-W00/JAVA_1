package chap_04;

public class _05_For {
	public static void main(String[] args) {
//		for 문은 정해진 횟수만큼 반복할 때 사용하는 반복문이다.
//		초기값 -> 조건 검사 -> 실행 -> 증감순으로 흐름이 진행된다.
		
//		반복문을 쓰지 않는 경우
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 성일정보고입니다.");
		
//		어서오세요를 -> 환영합니다로 변경 or 성일정보고를 소프트웨어개발과로 변경
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 성일정보고입니다.");
		System.out.println("어서오세요. 소프트웨어개발과입니다.");
		System.out.println("어서오세요. 소프트웨어개발과입니다.");
		System.out.println("어서오세요. 소프트웨어개발과입니다.");
		System.out.println("어서오세요. 소프트웨어개발과입니다.");
		System.out.println("어서오세요. 소프트웨어개발과입니다.");
		
		System.out.println("==== 여기부터 반복문 사용 ====");
		
//		for (초기값; 조건; 증감) {
//			실행할 코드
//		}
		for (int i=0; i < 10; i++) {
			System.out.println("환영합니다. 소프트웨어개발과입니다.");
		}
	
		// 짝수만 출력 0 2 4 6 8
		for (int i=0; i<10;i+=2) {
			System.out.println(i);
		}
		
		// 홀수만 출력 1 3 5 7 9
		for (int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		// 거꾸로 출력 5 4 3 2 1u7
		for (int i=5;i>0;i--) {
			System.out.print(i);
		}
		// 1부터 10까지의 합 출력
		int sum = 0;
		for (int i =1; i<= 10; i++) {
			sum = sum + i;
			System.out.println("현재까지 총합은 " + sum + "입니다.");
		}
		System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
