package chap_04;

import java.util.Scanner;

public class _Quiz_04 {
	public static void main(String[] args) {
//		문제
//		다음 조건에 따라 주차 요금을 계산하는 프로그램을 작성하세요.
		
//		요금 조건
//		시간당 4,000원
//		일일 최대 요금은 30,000원
//		경차 또는 장애인 차량은 최종 요금에 50% 할인
//		
//		풀이 조건
//		주차 시간은 입력 받는 형식으로 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주차 시간을 입력하세요 >> ");
		int hour = sc.nextInt();
		
		System.out.print("차량이 무엇입니까?(일반, 경차, 장애인) >> ");
		
		
		int yogold = hour * 4000;
		int choi = 0;
		
		String car = sc.next();
		
		switch(car) {
		case "경차", "장애인":
			choi = yogold / 2;
			break;
		default:
			choi = yogold;
		}
		
		if(yogold <= 30000) {
			System.out.println("주차 요금은 : " + choi + "원 입니다.");
		} else {
			System.out.println("일일 최대 요금입니다. 가격: 30000원");
		}
		
		sc.close();
	}
}
