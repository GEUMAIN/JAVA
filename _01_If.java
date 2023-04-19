package chap_04;

public class _01_If {
	public static void main(String[] args) {
		//조건문 IF
		int hour =15; // 오후 3시
		
		//성일카페에서 오후2시 이전에는 아메리카노 1+1
		if (hour < 14) {
			System.out.println("아메리카노 1+1");
		}
		
		/*
		 * if (조건식{
		 *  //실행할 코드
		 *  }
		 */
		
		//if 문 내에서 하나의 문장을 실행할 때는 {} 생략 가능
		if (hour < 14 ) System.out.println("아메리카노 1+1 (2)");
		
		//if 문 내에서 2개 이상의 문장을 실행할 때는 {}생략 불가
		if (hour < 10) {
			System.out.println("아메리카노 1+1");
			System.out.println("샷추가!!");
		}
		System.out.println("============");
		
		//오후 2시 이전, 모닝커피를 마시지 않은 경우?
		hour = 10;
		boolean moringcoffee = false;
		if (hour < 14 && !moringcoffee) {
			System.out.println("아메리카노 1+1");
		//if (hour < 14 && moringcoffee == false) {
				//System.out.println("아메리카노 1+1");
		}
		if (hour > 14 || moringcoffee);
		System.out.println("아메리카노 500원 할인");
		
	}
}
