package chap_02;

public class _04_Operator4 {
	public static void main(String[] args) {
		// 논리연산자
		boolean 김치찌개 = true;
		boolean 계란말이 = true;
		boolean 제육볶음 = true;
		
		// A 사람
		System.out.println(김치찌개 || 계란말이 || 제육볶음);
		// || OR조건은 하나라도 true이면 true 이다.
		// B 사람
		System.out.println(김치찌개 && 계란말이 && 제육볶음);
		// && AND조건은 모두가 true여야 true 이다.
		
		// AND 연산 (&&)
		System.out.println((5 > 3) && (3 > 1)); 	// true
		System.out.println((5 > 7) && (3 > 1)); 	// false
		
		// OR 연산 (||)
		System.out.println((5 > 3) || (3 > 1));		// true
		System.out.println((5 > 3) || (3 < 1));		// true
		System.out.println((5 < 3) || (3 < 1));		// false
		
		// NOT 연산 (!)
		System.out.println(!true);	// false
		System.out.println(!false);	// true
		System.out.println(!(5 == 5)); // false
		System.out.println(!(5 == 3)); // true
 		
	}
}
