package chap_03;

public class _04_EscapeSequences {
	public static void main(String[] args) {
		// 특수문자, 이스케이프 문자: \n \t \\ \" \'
		
		System.out.println("자바가");
		System.out.println("너무");
		System.out.println("재밌어요!!");
		
		// \n : 줄바꿈
		System.out.println("자바가\n너무\n재밌어요!!");  
		
		// \t : 탭 (정렬용 공백)
		System.out.println("해물파전\t\t9000원");
		System.out.println("김치전\t\t8000원");
		System.out.println("고추전\t\t8000원");
		
		// 역슬러시(\) 자체를 출력
		System.out.println("C:\\Program Files\\Java"); 
		// 역슬러시 하나만 하면 이스케이프로 간주하여 오류 발생. -> 두 번 써야 함
		
		
		// \" : 큰따옴표를 출력
		System.out.println("라때가 \"냐옹\" 이라고 했어요.");
		
		// 작은따옴표 출력
		System.out.println("모카가 \'뭘 봐?\' 라는 표정을 지었어요.");
		
		char c = '\''; 							// \' 출력
		System.out.println(c);
	}
}
