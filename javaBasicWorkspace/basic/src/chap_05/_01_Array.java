package chap_05;

public class _01_Array {
	public static void main(String[] args) {
//		배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
		
		String coffeeRoss = "아메리카노";
		String coffeeRachel = "카페모카";
		String coffeeChandler = "라떼";
		String coffeeMonica = "카푸치노";
		
		System.out.println(coffeeRoss + "하나");
		System.out.println(coffeeRachel + "하나");
		System.out.println(coffeeChandler + "하나");
		System.out.println(coffeeMonica + "하나");
		System.out.println("주세요!");
		
//		배열 선언
		String[] coffees1 = {};			// 대괄호 위치는 상관없음.
		String coffees2[] = {};
		
//		배열 선언할 때 배열의 크기를 지정하는 방법
//		배열은 크기를 지정해줘야지만 사용할 수 있다!!! (new String[칸 수 입력])
		String[] coffees = new String[4];	// 문자열만 들어갈 수 있는 4칸짜리 배열을 생성, 배열 이름이 coffees
		coffees[0] = "아메리카노";		// 한 방씩 값을 넣어줌.
		coffees[1] = "카페모카";
		coffees[2] = "라떼";
		coffees[3] = "카푸치노";
		
		String[] coffees3 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
		// 문자열만 들어갈 수 있는 배열을 생성하는데, 값으로 아메리카노, 카페모카, 라떼, 카푸치노를 할당하였음.
		// 따라서 coffees3 이라는 이름의 4칸짜리 배열이 생성됨.
		
		String[] coffees4 = {"아메리카노", "카페모카", "라떼", "카푸치노"};
		// 위와 동일하지만 new String[] 을 생략할 수 있다.
		
		String str = new String("아메리카노");		// 공식
		String str2 = "카페라떼";					// 편의상 new String 생략
		
		System.out.println(coffees[0] + " 하나");
		System.out.println(coffees[1] + " 하나");
		coffees[2] = "에스프레소";			// 라떼 -> 에스프레소 (배열 값 변경가능.)
		System.out.println(coffees[2] + " 하나");
		System.out.println(coffees[3] + " 하나");
		System.out.println("주세요.");
		
//		System.out.println(coffees);       배열 이름만 출력하면 값이 안나옴.
		
//		정수형 배열
		int[] i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		
//		실수형 배열
		double[] d = {10.0, 11.2, 15.3};
		
//		boolean 형 배열
		boolean[] b = {true, false, false};
		// 이외에 다른 기본 타입도 다 배열이 가능!

	}
}
