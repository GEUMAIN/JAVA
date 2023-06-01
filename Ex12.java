package test;

import java.util.Scanner;

public class Ex12 {
	// 숫자를 입력받으면 그 수가 소수인지 판별하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		boolean prime = true;
		for (int i=2; i<=num/2; i++) { //1는 모든수의 약수이기 때문에 2부터 시작
			//그리고 num으로 해도 괜찮지만 반으로 나누어 for문 돌리는 수를 줄인다
			if(num%i==0) {
				prime = false;
				break;
			}
		}
//		if(prime == true) {
//			System.out.println("소수입니다");
//		}else if(prime == false) {
//			System.out.println("소수가 아닙니다");
		
//		}
		System.out.println(prime ? "소수입니다" : "소수가 아닙니다");
	}
}
