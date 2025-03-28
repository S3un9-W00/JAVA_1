package chap_01;

public class _03_Variables {
	public static void main(String[] args) {
//		System.out.println("홍길동님, 배송이 시작됩니다. 15시에 방문 예정입니다.");
//		System.out.println("홍길동님, 배송이 완료되었습니다.");
//		System.out.println("장발장님, 배송이 시작됩니다. 16시에 방문 예정입니다.");
//		System.out.println("장발장님, 배송이 완료되었습니다.");
		
		
		
		String name = "홍길동"; // 노란색: 경고
		int hour = 15;
		
		System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
		System.out.println(name + "님, 배송이 완료되었습니다.");
		
		name = "강백호";
		hour = 10;
		
		System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
		System.out.println(name + "님, 배송이 완료되었습니다.");
		
		double score = 90.5;
		char grade ='A';
		String stuName = "서태웅";
		System.out.println(stuName + "님의 평균 점수는" + score + "점 입니다.");
		System.out.println("학점은" + grade + "입니다.");
		
		boolean pass = true;
		System.out.println("이번 시험에 합격했을까요?" + pass);
		
		// String : 문자열 / char : 문자 / int : 정수 / double : 실수 / boolean : 논리
		
		double d = 3.14123456789;
		float f = 3.14123456789f;
		// 실수형 데이터타입의 기본은 double 이다.
		
		System.out.println(d);
		System.out.println(f);
		
		// byte - short - int - long
		//   1 	-   2	-  4  -   8 
		
		long l = 1_000_000_000_000L;
		System.out.println(l);
		
		
	}
}
