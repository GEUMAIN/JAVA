package chap_05;

public class _05_ASCII {
	public static void main(String[] args) {
		// 아스키코드 : 미국 표준 코드
		// 유니코드 : 한글,한자 등(영어로 쓰기 어려운 언어)
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		// byte - short - int - long - float - double
		//         char - int - long - float - double
		
		c = 'B';
		System.out.println(c);
		System.out.println((int)c);
		
		c++;
		System.out.println(c);
		System.out.println((int)c);
		
		// 10 * 15 크기의 영화관 좌석을 배열로 구현
		// A01 - A15
		// B01 ~ B15
		String[][] seats = new String[10][15];
		char ch ='A';
		for (int i=0; i<seats.length; i++,ch++) {
			for (int j=0; j<seats[i].length; j++) {
				seats[i][j]= String.valueOf(ch) + (j+1);
			}
		}
		
		//출력
		for (int i=0; i<seats.length; i++,ch++) {
			for (int j=0; j<seats[i].length; j++) {
				System.out.print(seats[i][j] + " ");	
			}
			System.out.println();
		}
	}
}
