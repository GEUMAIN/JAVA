package test;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//팩토리얼 계산기
		//5! = 5*4*3*2*1
		//어떤 수 num를 입력받으면 그 수의 팩토리얼을 출력!!
		Scanner sc = new Scanner(System.in);
		int fact = 1; //누적곱을 구할 땐 항상 1로 초기화
		//int sum = 0; 누적합을 구할 땐 항상 0로 초기화
		int num = sc.nextInt();
//		for (int i = 1; i<=num; i++) {
//			fact= fact*i;
//		}
//		System.out.println(fact);
		while ( num > 1) {
			fact = fact*num;
			num--;
		}
		System.out.println(fact);
	}
}
