package chap_04;

import java.util.Scanner;

public class _Quiz_04 {
	public static void main(String[] args) {
//		문제
//		다음 조건에 따라 주차 요금을 계산하는 프로그램을 작성하세요.
//		
//		요금 조건
//		시간당 4,000원
//		일일 최대 요금은 30,000원
//		경차 또는 장애인 차량은 최종 요금에 50% 할인
//		
//		풀이 조건
//		주차 시간은 입력 받는 형식으로 작성
		Scanner sc = new Scanner (System.in);
		System.out.println("시간 입력 : ");
		
		int hour = sc.nextInt();
		boolean SmallCar = false;
		boolean disabled = true;
		
		int fee = hour * 4000;
		
		if (fee > 30000) {
			fee = 30000;
		}
		
		if (SmallCar || disabled) {
			fee /= 2;
		}
		
		System.out.println("주차 요금은 " + fee + "원입니다.");
		sc.close();
		
		

			}
}
