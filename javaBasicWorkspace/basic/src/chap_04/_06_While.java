package chap_04;

public class _06_While {
	public static void main(String[] args) {
//		while문은 조건이 참인 동안 반복해서 실행되는 반복문이다.
//		for문과 달리 반복 횟수가 명확하지 않을 때 자주 사용된다.
		
//		수영장에서 수영하는 상황을 가정
		int distance = 25;	// 전체 거리 25m
		int move = 0;		// 현재 이동 거리
		
		while (move < distance) {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리: " + move);
			move += 3;	// 한 번에 3m씩 이동
		}
		System.out.println("도착하였습니다.");
		
//		단, while문에 정말 주의해야할 것은 비의도적으로 무한루프에 빠지는 것이다!!
		
		// 무한루프
//		move = 0;
//		while (move < distance) {
//			System.out.println("발차기를 계속 합니다.");
//			System.out.println("현재 이동 거리: " + move);
		}
	}

