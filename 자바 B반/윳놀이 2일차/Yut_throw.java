package yut_play;

import java.util.Random;
import java.util.Scanner;

public class Yut_throw {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		while (true) {
			
			// 윷 던질래?
			if(sc.nextInt() == 1) {
				// 윷 랜덤 구현
				String Yut = "";
				String Yutvalue = "";
				for (int i =1; i<=4; i++) {
					Yut = Yut + rd.nextInt(2);
				}
				if (Yut.equals("0001") || Yut.equals("0010") || Yut.equals("0100"))Yutvalue = "도";
				if (Yut.equals("0011") || Yut.equals("0101") || Yut.equals("0110") || Yut.equals("1001")|| Yut.equals("1010")|| Yut.equals("1100"))Yutvalue = "개";
				if (Yut.equals("0111") || Yut.equals("1011") || Yut.equals("1101") || Yut.equals("1110"))Yutvalue = "걸";
				if (Yut.equals("1000"))Yutvalue = "빽도";
				if (Yut.equals("0000"))Yutvalue = "모";
				if (Yut.equals("1111"))Yutvalue = "윷";
				// 결과 출력
				System.out.println(Yut +" "+Yutvalue);
				YutOutPut(Yut,Yutvalue);
			}
		}
	}

	public static void YutOutPut(String Yut,String Yutvalue) {
		// Yut : 1	1	1	0
		// [0][1][2][3]
		for (int i = 0; i<Yut.length(); i++) {
			if(Yut.charAt(i) == '0') {
				//0일때
				System.out.println("┌────────────┐");
				System.out.println("│            │");
				System.out.println("└────────────┘");	
			}else{
				if(Yutvalue == "빽도") {
					System.out.println("┌────────────┐");
					System.out.println("│ X          │");
					System.out.println("└────────────┘");	
				}else {
					//1일때
					System.out.println("┌────────────┐");
					System.out.println("│ X  X  X  X │");
					System.out.println("└────────────┘");	
				}
			}
		}	
	}
}