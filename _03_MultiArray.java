package chap_05;

public class _03_MultiArray {
	public static void main(String[] args) {
		//다차원 배열 (2차원 배열)
		
		//소규모 영화관 좌석
		// A1~A5
		// B1~B5
		// C1~C5
		
		String[] seatA ={"A1","A2","A3","A4","A5"};
		String[] seatB ={"B1","B2","B3","B4","B5"};
		String[] seatC ={"C1","C2","C3","C4","C5"};
		
		String[][] seats = new String[][] {
			{"A1","A2","A3","A4","A5"},
			{"B1","B2","B3","B4","B5"},
			{"C1","C2","C3","C4","C5"}
		};
		
		// B2 값에 접근하려면?
		System.out.println(seats[1][1]);
		
		// C5 값에 접근하려면?
		System.out.println(seats[2][4]);
		
		String[][] seats2 = new String[][] {
			{"A1","A2","A3"},
			{"B1","B2","B3","B4"},
			{"C1","C2","C3","C4","C5"}
		}; //각각의 행마다 열의 갯수는 다를 수 있다
		
		// A3 값에 접근하려면?
		System.out.println(seats2[0][2]);
		
		// 3차원 배열 만들려면?
		String[][][] marray = new String[3][3][3];
	}
}
