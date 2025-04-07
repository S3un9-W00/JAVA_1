package chap_03;

// 주민들록번호 문자열에서 생년월일과 성별을 나타내는 앞7자리까지만 출력하는 프로그램을 작성하시오.
// 예시
// "901231-1234567" -> "901231-1"
// "030708-4567890" -> "030708-4"

public class _Quiz_03 {
	public static void main(String[] args) {

		String s = "901231-1234567";
		System.out.println(s.substring(0,8));
		
		s = "030708-4567890";
		System.out.println(s.substring(0, s.indexOf("-") + 2));
		
		
	}   

}
