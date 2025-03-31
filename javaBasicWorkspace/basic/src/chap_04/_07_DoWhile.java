package chap_04;

public class _07_DoWhile {
	public static void main(String[] args) {
//		do-while문은 조건과 관계없이 최소 한 번은 실행되는 반복문이다.
//		조건은 반복문 끝에서 검사하므로 초기 조건이 false여도 무조건 한 번은 실행된다.
		
//		기본 while문
		int distance = 25;
		int move = 0;
		int height = 2;
		
		while(move + height < distance) {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리: " + move);
			move += 3;
		}
		System.out.println("도착했습니다.");
		
		System.out.println("===== 반복문 #1 =====");
		
//		키가 매우 큰 사람 가정(while문 조건 만족 x)
		move = 0;
		height = 25;
		
		while(move + height < distance) {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리: " + move);
			move += 3;
		}
		System.out.println("도착했습니다.");
		
		System.out.println("===== 반복문 #2 =====");
			
		do {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리: " + move);
			move += 3;
		}while(move + height < distance);
		
		System.out.println("도착했습니다.");
	}
//	구분			|  while               |     do-while
//	조건 검사 위치 | 반복문 시작전 		   | 반복문 실행 후
//	최소 실행 여부 | 조건 false면 실행 안 됨 | 조건이 false여도 한 번 실행
}
