package chap_03;

public class _03_StringCompare {
	public static void main(String[] args) {
		//문자열 비교(중요하고 헷갈림)
		String s1 = "Java";
		String s2 = "java";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//문자열 비교 심화
		System.out.println("============================");
		s1 = "1234";
		s2 = "1234";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println("=============================");
		
		s1 = new String("1234");
		s2 = new String("1234");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
	}
}
