package chap_04;
import java.util.*;

public class _Exam_04_2 {
	public static void main(String[] args) {
//		문제 설명
//		1~50 사이의 숫자 중 하나를 정답으로 설정한다. (예:27)
//		사용자가 숫자를 입력하여 정답을 맞추는 게임이다.
//		입력한 숫자가 정답보다 크면 "DOWN", 작으면 "UP"을 출력한다.
//		정답을 맞추면 "정답입니다!"를 출력하고 종료한다.
		
//		추가 1. 횟수제한(7번)
//		추가 2. 점수시스템(7-시도한횟수 * 1000점)
//		추가 3. 게임 다시 시작 여부 확인
		
		Scanner sc = new Scanner(System.in);
		
		int setO =(int) (Math.random()*50)+1;
		
		int avild = 0;
		int score = 0;
		
		while(true) {
			System.out.print("num >> ");
			int setnum = sc.nextInt();
			
			if(setnum < setO) {
				System.out.println("UP");
				if(avild <= 7) {
					avild++;
				} else {
					System.out.println("횟수 초과");
					System.out.print("다시 하시겠습니까? <1>네 <2~>아니요 >> ");
					int choice = sc.nextInt();
					if(choice == 1) {
						continue;
					} else {
						break;
					}
				}
				
				
			} else if(setnum > setO) {
				System.out.println("DOWN");
				if(avild <= 7) {
					avild++;
				} else {
					System.out.println("횟수 초과");
					System.out.print("다시 하시겠습니까? <1>네 <2~>아니요 >> ");
					int choice = sc.nextInt();
					if(choice == 1) {
						avild = 0;
						choice = 0;
						continue;
					} else {
						break;
					}
				}
			} else if(setnum == setO) {
				System.out.println("정답입니다.");
				System.out.println("점수 : " + ((7-(avild)) * 1000));
				System.out.print("다시 하시겠습니까? <1>네 <2~>아니요 >> ");
				int choice = sc.nextInt();
				if(choice == 1) {
					avild = 0;
					choice = 0;
					continue;
				} else {
					break;
				}
			} else {
				System.out.println("?");
			}
		}
		
		sc.close();
	}
}
