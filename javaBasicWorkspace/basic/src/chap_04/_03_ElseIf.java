package chap_04;

public class _03_ElseIf {
	public static void main(String[] args) {
//		else if 는 여러 조건을 순차적으로 검사할 때 사용하는 조건문이다.
//		if -> else if -> else 순서로 조건을 평가하며, 첫 번째로 참인 조건만 실행된다.
		
//		한라봉 에이드 있으며 +1
//		또는 망고 주스가 있으면 +1
//		또는 아이스 아메리카노 +1
		
		boolean hallabongAde = false;
		boolean mangoJuice = false;
		
		if (hallabongAde) {
			System.out.println("한라봉 에이드 +1");
		} else if (mangoJuice) {
			System.out.println("망고 주스 +1");
		} else {
			System.out.println("아이스 아매리카노 +1");
		}
		System.out.println("커피 주문 완료 #1");
		
		hallabongAde = false;
		mangoJuice = false;
		boolean orangeJuice = true;
		
		if (hallabongAde) {
			System.out.println("한라봉 에이드 +1");
		} else if (mangoJuice) {
			System.out.println("망고 주스 +1");
		} else if (orangeJuice){
			System.out.println("오렌지 주스 +1");
		} else {
			System.out.println("아이스 아메리카노 +1");
		}
		System.out.println("커피 주문 완료 #3");
		
	}
}
