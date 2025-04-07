package chap_03;

public class _01_String1 {
	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
		System.out.println(s);
		
		// 문자열의 길이
		System.out.println(s.length());  // 29 (공백 포함)
		
		// 대소문자 변환
		System.out.println(s.toUpperCase());  // 대문자
		System.out.println(s.toLowerCase());  // 소문자
		
		// 포함관계
		System.out.println(s.contains("java")); 	// 포함되었으면 true
		System.out.println(s.contains("C#"));   	// 포함X. false
		
		System.out.println(s.indexOf("java"));  	// 문자열이 처음 등자하는 위치(인덱스값) 변환
		System.out.println(s.indexOf("C#"));    	// 없을 경우 -1 반환
		System.out.println(s.indexOf("and"));   	// 처음 일치하는 위치(인덱스값) 반환
		
		System.out.println(s.lastIndexOf("and"));   // 마지막 일치하는 위치(인덱스값) 반환
		System.out.println(s.startsWith("I like")); // 문자열이 특정 구문으로 시작하면 true
		System.out.println(s.endsWith("C."));       // 문자열이 특정 구문으로 종료하면 true
		
	}	
}
