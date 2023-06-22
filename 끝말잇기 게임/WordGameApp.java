package games.word;

import java.util.Scanner;

public class WordGameApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String startWord = "성일정보고";
		
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("게임에 참여하는 인원은 몇 명입니까? >>");
		
		int playerNum = sc.nextInt();
		
		// 문자열 타입의 배열 strArr 3칸짜리 만들어라!!
		String strArr[] = new String[3];
		// Player 클래스도 String 처럼 참조형 변수로 볼 수 있다!!
		//문자열 타입의 배열을 만들듯이 Player 타입의 배열도 만들 수 있다
		Player Play[] = new Player[playerNum];
		
		//클래스이름 변수이름 = new 변수이름();
		
		for (int i = 0; i < Play.length; i ++) {
			System.out.print("참가자의 이름을 입력하세요 >>");
			Play[i] = new Player();
			Play[i].name = sc.next();
		}
		//반복하기 위해 변수를 만든다
		int i = 0, j = 0;
		
		System.out.printf("시작하는 단어는 %s 입니다.\n",startWord);
		
		
		while(true) {
			i = j % playerNum;
			
			int lastIndex = startWord.length() - 1;
			char lastChar = startWord.charAt(lastIndex);
			
			System.out.print(Play[i].name+ " >> ");
			Play[i].writeWord();
			
			boolean counting = Play[i].chksuccess(lastChar);
			
			if (counting == false) {
				System.out.println(Play[i].name + "님이 졌습니다");
				break;
			}
			
			startWord = Play[i].word;
			j++;
		}
		
		sc.close();
	}
}
