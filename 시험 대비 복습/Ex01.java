package test2;

import java.util.Scanner;

public class Ex01 {
	//2~9중 번호를 입력 받아 그 번호에 해당하는 구구단을 출력하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 단을 입력해주세요. 2~9");
		
		int dan = sc.nextInt();
		
		for ( int i = 1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}
}
