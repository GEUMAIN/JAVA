package Test;

import java.util.Scanner;
public class Ex05 {
	// 1부터 100중의 랜덤한 수를 맞추는 게임
	// 예를 들어 cpu가 랜던함 수를 뽑았는데 69로 가정하면
	// 플레이어가 50을 말하면, cpu UP이라고 응답
	// 플레이어가 70을 말하면, cpu DOWN이라고 응답
	// 정답을 맞출 때 총 몇 번 시도했는지 출력하면 됨.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int ranNum = (int)(Math.random() * 100)+1; 
		//Math.random() : 0.000000 ~ 0.999999 중 발생
		//Math.random()*100 : 0.00000 ~ 99.999999 중 발생
		//(int)(Math.random()*100) : 0 ~ 99 중 발생
		//int)(Math.random()*100)+1 : 1 ~ 100 중 발생
		System.out.println("컴퓨터가 수를 선택 했습니다");
		while(true) {
		System.out.println("수를 입력해주세요");
		int player = sc.nextInt();
		if (player < ranNum) {
			System.out.println("UP");
			cnt++;
		}else if ( player > ranNum) {
			System.out.println("Down");
			cnt++;
		}else if (player == ranNum) {
			System.out.println("맞췄습니다 맞추기 까지 시도한 횟수 : "+ cnt);
			break;
		}
		}
	}
}
