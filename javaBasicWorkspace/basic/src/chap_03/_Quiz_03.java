package chap_03;
import java.util.*;

public class _Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 주민등록번호를 입력하세요. >> ");
		String jumin = sc.next();
		
//		System.out.println("당신의 주민등록번호는 : " + jumin.substring(0, 8));
		System.out.println("\n\n\n당신의 주민등록번호 앞자리만 하면 : " + jumin.substring(0, jumin.indexOf("-") + 2) + "입니다.");
	}
}
