package chap_04;

import java.util.Scanner;

public class _09_MultipleTable {
	public static void main(String[] args) {
		
		//1
		for(int i = 2; i <= 9; i++) {
			System.out.printf("=====%d단=====\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d \n", i, j, (i*j));
			}
		}
		
		System.out.println();
		
		//2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇단을 출력하시겠습니까? >> ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num*i));
		}
		
		System.out.println();
		
		//3
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %02d\t", j, i, (j*i));
			}
			System.out.println();
		}
	}
}
