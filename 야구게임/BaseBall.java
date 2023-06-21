package game;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		//1~9 수 중에 랜덤으로 세 개의 수를 감춘다!
		Scanner sc = new Scanner(System.in);
		
		//변수
		// 랜덤으로 뽑은 3자리의 수를 저장하기 위한 배열 randomNum을 생성
		
		int[] randomNum = new int[3];
		//유저가 입력한 수를 저장하기 위한 배열 userNum을 생성
		int[] userNum = new int[3];
		// 스트라이크와 볼의 갯수를 저장하기 위한 변수가 필요
		int strike = 0;
		int ball = 0;
		
		// 1단계 : randomNum에 반복문을 이용하여 랜덤한 3개의 수를 할당 (1~9)
		// 2단계 : 입력받은 수 3개가 서로 다른 정수여야 한다.
		// Math.random() -> 0.0000 ~ 0.999999
		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int)(Math.random()*9) +1;
			for (int j = 0; j < i; j++) {
				if(randomNum[j] == randomNum[i]) {
					i--;
					break;
				}
			}
		}
		
//		for (int num : randomNum) {
//			System.out.print(num + " ");
//		}
//		
		// user의 입력값 처리
		for (int i = 0; i < userNum.length; i++) {
			System.out.println((i+1)+"번째 수를 입력하세요 >>");
			userNum[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if(userNum[j] == userNum[i]) {
					i--;
					break;	
				}
			}
		}
	}
}
