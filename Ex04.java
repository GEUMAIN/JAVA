package arrayTest;

import java.util.Scanner;

public class Ex04 {
	//100개의 정수를 저장할 수있는 배열을 선언하고
	//정수를 차례로 입력하다가 0이 입력되면
	//입력을 멈추고
	//가장 마지막에 입력된 수 부터 역순으로 출력하시오
	//1 2 3 4 5 6 7 8 9 0
	// 9 8 7 6 5 4 3 2 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int cnt =0;
		System.out.println("숫자를 입력하세요");
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i]==0) {
				break;
			}	
			cnt++;
		}
		for (int i =cnt-1; i>=0; i--) {
			System.out.print(num[i]+" ");
		}
	}
}
