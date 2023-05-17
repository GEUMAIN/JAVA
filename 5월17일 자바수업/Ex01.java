package Test;

import java.util.Scanner;

public class Ex01 {
	//2에서 9까지 숫자중에 번호를 입력받아 그 번호의 해당하는 구구단을 출력하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=1; i<=9; i++) {
			System.out.println(num + " * " + i +" = " + (num*i));
		}
		
	}
}
