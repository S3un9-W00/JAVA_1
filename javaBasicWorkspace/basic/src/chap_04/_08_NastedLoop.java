package chap_04;

public class _08_NastedLoop {
	public static void main(String[] args) {
//		이중 반복문
//		*****
//		*****
//		*****
//		*****
//		*****
		
//		1. *****
		for (int i=0; i<5;i++) {
			System.out.print("*");   // ln X.
		}
		System.out.println();
//		2. 
//		*
//		*
//		*
//		*
//		*
		for (int i=0; i<5;i++) {
			System.out.println("*");   
		}
//		3. 위의 for문 두개 합치기
		for (int i=0; i<5; i++) {
			for (int j=0; j<5;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
//		*
//		**
//		***
//		****
//		*****
		System.out.println("----------------");

		for (int i=0; i<5; i++) {
			for (int j=0; j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println("--------------------");
		
		
		
//		     *
//		    **
//		   ***
//		  ****
//		 *****
		
		for (int i=0; i<5; i++) {
			for (int j=4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
