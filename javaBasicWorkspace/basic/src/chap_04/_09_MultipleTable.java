package chap_04;
import java.util.Scanner;

public class _09_MultipleTable {
	public static void main(String[] args) {
		// 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int s = sc.nextInt();
		
		
		
		for (int i=1; i < 10; i++) {
			System.out.println(s + "i" + i + "=" + (s*i));
		}
		
		for (int i=2; i < 10; i++) {
			for (int j=1; j<10;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
				
			}
		System.out.println();
		}
	}

