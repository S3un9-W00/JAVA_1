package chap_02;

public class _01_Operator1 {
	public static void main(String[] args) {
		// 산술연산자
		
		// Ctrl + alt + 아래방향키 (복제)
		// ctrl + d (한 줄 삭제)
		
		// 일반 연산
		System.out.println(4 + 2);  // 6
		System.out.println(4 - 2);  // 2
		System.out.println(4 * 2);  // 8
		System.out.println(4 / 2);  // 2
		System.out.println(5 / 2);  // 2.5 -> 2 (정수만 나옴)
		System.out.println(2 / 4);  // 0.25 -> 0
		System.out.println(4 % 2);  // 0 
		System.out.println(5 % 2);  // 1 
		
		// 우선 순위 연산
		System.out.println(2 + 2 * 2);	// 6
		System.out.println((2 + 2) * 2); // 8
		System.out.println(2 + (2 * 2)); // 8
		// 변수를 이용한 연산
		int a = 20;
		int b = 10;
		int c;
		
	                                      	
		c = a + b;
	    System.out.println(c);	// 30
	
	    c = a - b;
	    System.out.println(c); // 10
	    
	    c = a * b;
	    System.out.println(c);	// 200
	    
	    c = a / b;
	    System.out.println(c);	// 2
	    
	    c = a % b;
	    System.out.println(c);	// 0
	    
	    System.out.println("========================");
	    
	    // 증감 연산 ++, --
	    int val;
	    val = 10;
	    System.out.println(val);	// 10
	    System.out.println(++val);	// 11  값 증가 후 문장
	    System.out.println(val);	// 11
	    
	   val = 10;
	   System.out.println(val); 	// 10
	   System.out.println(val++); 	// 10  문장 후 값 증가
	   System.out.println(val); 	// 11
	   
	   val = 10;
	   System.out.println(val); 	// 10
	   System.out.println(--val); 	// 9
	   System.out.println(val); 	// 9
	   
	   val = 10;
	   System.out.println(val); 	// 10
	   System.out.println(val--); 	// 10  
	   System.out.println(val); 	// 9
	   
	   // 은행 대기번호표
	   int waiting = 0;
	   System.out.println("대기 인원 : " + waiting++); // 0
	   System.out.println("대기 인원 : " + waiting++); // 1
	   System.out.println("대기 인원 : " + waiting++); // 2
	   System.out.println("총 대기 인원 : " + waiting); // 3
	   
	   
	   
	   
	   
	}
}