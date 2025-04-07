package chap_06;

public class _01_Method {
	
	public static void sayHello() {
		System.out.println("안녕하세요? 메소드입니다.");
	}
//	sayhello() : 메소드 이름
//	void : 반환타입 -> 그 중에서 void는 반환값이 없음
//	() : 메소드 이름 다음에 소괄호가 비어있는 것은 입력값(매개변수)가 없다는 의미
	
	
	public static void main(String[] args) {
//		메소드란?
//		특정한 동작(코드)을 한 번만 정의해두고,
//		필요할 때마다 호출해서 사용할 수 있는 코드 블록이다.
		
//		메소드 호출
		System.out.println("메소드 호출 전");
		sayHello();
		sayHello();
		sayHello();
		System.out.println("메소드 호출 후");
	}
}
