package chap_04;

import java.util.Scanner;

public class _Exam_04 {
	public static void main(String[] args) {
//		1. 1부터 100까지 숫자 중 3의 배수만 출력하기
		for(int i = 1; i <=100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		System.out.println("===========================");
//		
//		2. 입력한 숫자까지 합 구하기(음수 입력시 중단)
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int num = sc.nextInt();
			if(num < 0) {
				System.out.println("gg");
				break;
				
			}
			sum += num;
			System.out.println("sum : " + sum);
			
		}
		System.out.println("===========================");
		
//		3. 1부터 50까지 숫자 중 4의 배수이지만 8의 배수는 제외하고 출력
		for(int i = 1; i <= 50; i++) {
			if(i%4==0 && i%8!=0) {
				System.out.println(i);
			}
		}
		System.out.println("===========================");
		
//		4. 1~100 중 첫번째로 7의 배수이면서 9의 배수인 수 찾기
		for(int i = 1; i <= 100; i++) {
			if(i%7==0 && i%9==0) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("===========================");
		
//		5. 구구단 출력 - 5단은 건너뛰기
		for(int i = 2; i <= 9; i++) {
			if(i == 5) {
				continue;
			}
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			System.out.println("===========================");
		}
		sc.close();
	}
}
