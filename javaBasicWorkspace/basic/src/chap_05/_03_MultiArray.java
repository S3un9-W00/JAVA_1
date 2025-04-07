package chap_05;

public class _03_MultiArray {
	public static void main(String[] args) {
		String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
		String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
		String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
		
//		2차원 배열
//		-행과 열을 갖는 배열 구조
//		-표처럼 좌석이나 표 데이터를 표현할 때 자주 사용 됨.
//		-배열에서 첫 번째 []는 행, 두 번째 []는 열을 나타낸다.
//		-단, 2차원 배열의 행과 열의 인덱스는 0부터 시작한다.
		String[][] seats =  {
				{"A1", "A2", "A3", "A4", "A5"},
				{"B1", "B2", "B3", "B4", "B5"},
				{"C1", "C2", "C3", "C4", "C5"}
		};
		
		System.out.println(seats[0][0]); // A1
		System.out.println(seats[2][4]); // C5
		
//		가변 배열 (행마다 열의 개수가 다를 수 있음)
		String[][] seats2 = {
				{"A1", "A2", "A3"},
				{"B1", "B2", "B3", "B4"},
				{"C1", "C2", "C3", "C4", "C5"}
		};
		
		System.out.println(seats2[0][2]); // A3
		System.out.println(seats2[0][4]); // seats[][] 로 봤을 때는 A5가 나와야 되지만 여기선 값이 없다. (인덱스 초과)
		
		String[][][] marray = new String[3][3][3]; //세로3, 가로3, 높이3의 3차원 배열 선언
	}
}
