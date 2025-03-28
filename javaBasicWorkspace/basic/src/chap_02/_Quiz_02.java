package chap_02;

import java.util.Scanner;

public class _Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 : ");
		int height = sc.nextInt();
		
		// 입력받은 키가 120cm 넘으면 탑승 가능한 놀이기구가 있다.
		// 입력받은 키에 따라 다음과 같이 출력하시오.
		
		// 키가 115cm 이므로 탑승 불가능합니다.
		// 키가 121cm 이므로 탑승 가능합니다
		
		// 삼항 연산자로 구현할 것
		
		
		String s = (height >= 120) ? "가능" : "불가능";
		System.out.println("키가 " + height + " 이므로 탑승 " + s + "입니다.");
		
		
		sc.close();
	}
}
