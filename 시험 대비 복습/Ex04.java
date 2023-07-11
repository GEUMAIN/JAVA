package test2;

import java.util.Scanner;

public class Ex04 {

	// 어떤 정수 n을 입력받고,
	// 1부터 홀수를 차례대로 더하면서 합이 n보다 크면 그 때까지 더한 홀수의 갯수와 그 합을 구하시오.
	// 입력 : 1000 / 출력 32, 1024
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		int n = sc.nextInt();
		int i;
		int sum = 0;
		int cnt = 0;
		
		for (i = 1; ; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
				cnt++;
			}
			if (sum > n){
				break;
			}
		}
		System.out.println(cnt + "," + sum);
	}
}
