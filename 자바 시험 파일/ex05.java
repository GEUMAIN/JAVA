package exam;

import java.util.Scanner;

public class ex05 {
// 반복문에서 아래와 같이 입력했을 때 시작부터 마지막 값까지 증가 값만큽 증가하면서 합한 결과는?	
// 시작 : 1 / 마지막 : 99 / 증가값 : 2
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작값 :");
		int start = sc.nextInt();
		System.out.println("종료값 :");
		int end = sc.nextInt();
		System.out.println("증가값 :");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i<=end; i+=num) {
			sum = sum + i;
		}
		System.out.printf("%d부터 %d까지 %d만큼 증가한 값을의 합은 %d이다.",start,end,num,sum);
	}
}
