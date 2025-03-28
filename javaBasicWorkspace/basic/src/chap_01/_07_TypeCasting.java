package chap_01;

public class _07_TypeCasting {
	public static void main(String[] args) {
//		형변환(Type Casting)
//		- 변수의 데이터 타입을 변환하는 과정
//		- 묵시적 형변환 (자동 형변환) : 작은 데이터타입 -> 큰 데이터 타입
//		- 명시적 형변환 (수동 형변환) : 큰 데이터 타입 -> 작은 데이터 (형변환 연산자 (type) 필요)
		int score= 93;
		System.out.println(score);
		System.out.println((float) score); // 실수(float)
		System.out.println((double) score); // 실수 (double)
		
//		byte -> short -> int -> long -> float -> double (정수 끼리는 자동 형변환 발생)
//				char -> int -> long -> float -> double
		
		int score2 = 95;
		System.out.println(score2);
		double score3 = score2;
//		double score3 = (double) score2;
		
		float score_f = 93.3f; // 큰 거를 작은 거에다 두면 처리X. (수동으로(f))
		double score_d = 98.8;
		System.out.println((int) score_f);
		System.out.println((int) score_d);
		
//		score = 93 + 98.8;
//		score = 93.0 + 98.8
//		int score = 000.0 <-- 오류 발생
		
		score = 93 + (int) 98.8;
		System.out.println(score);
		
		score_d = (double) 93 + 98.8;
		System.out.println(score_d);
		
		// 숫자를 문자열로 변환
		String s1 = String.valueOf(93);
		System.out.println(s1);
		s1 = Integer.toString(98);
		System.out.println(s1);
		
		// 문자열을 숫자로 변환
//		int i = "93";  왼쪽은 정수형 오른쪽은 문자열이 오류 발생
//		int i = (int) "93";  기본데이터 타입에 사용하던 캐스팅을 사용할 수 없음
		int i = Integer.parseInt("93");
		System.out.println(i);
		double d = Double.parseDouble("98.8");  // 문자열이 실수로 변경
		System.out.println(d);
		
		double sum = i + d;
		System.out.println(sum);
		String sum2 = "93" + "98.8";
		System.out.println(sum2);
		
		int error = Integer.parseInt("java");
		System.out.println(error);
	}
}
