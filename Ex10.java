package test;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		//피보나치 수열
		//입력한 숫자만큼 피보나치 수열 출력
		//출력된 수열의 모든 합을 구해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 출력할 것인지 적어주세요");
		int ln = sc.nextInt();
		int a= 1; //전전 항
		int b= 1; //전 항
		int c = a+b; //다 더한것
		
		System.out.print(a+ " ");
		System.out.print(b+ " ");
		
		for (int i = 3; i<=ln; i++) {
			int d = a + b;
			c = c + d;
			System.out.print(d + " ");
			
			a = b;
			b = d;
		}
		System.out.println();
		System.out.print(c);
	}
}
