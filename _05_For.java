package chap_04;

public class _05_For {
	public static void main(String[] args) {
		// 반복문
		// 성일 매장
		System.out.println("어서오세요. 성일매장입니다.");
		// 또 다른 손님
		System.out.println("어서오세요. 성일매장입니다.");
		System.out.println("어서오세요. 성일매장입니다.");
		System.out.println("어서오세요. 성일매장입니다.");
		System.out.println("어서오세요. 성일매장입니다.");
		
		// 만약 인사말이 바뀌면?
		System.out.println("환영합니다. 성일매장입니다.");
		System.out.println("환영합니다. 성일매장입니다.");
		System.out.println("환영합니다. 성일매장입니다.");
		// 매장 이름이 바뀌면?
		// 성일 매장 - 소프틈장
		System.out.println("환영합니다. 소프트매장입니다.");
		System.out.println("환영합니다. 소프트매장입니다.");
		System.out.println("환영합니다. 소프트매장입니다.");
		
		// 코드가 만 줄이 넘는 상황이고, 모든 코드에 대해 단순히 수정을 하는 상황이라면?
		//많은 시간이 걸리고, 단순한 작업으로 인한 집중력 저하로 실수가 발생할 수 있다.
		// 그래서 반복문이 필요하다!!
		
		// 반복문 사용 FOR
		//for (초기화; 조건; 증감) {
			//반복될 코드
		// 1부터 10까지 - 배열
		for (int i=0; i<10; i++) {
			System.out.println(i+1);
		}
		
		for (int i= 0; i<10; i++) {
			//System.out.println("어서오세요. 성일매장입니다.");
			//System.out.println("환영합니다. 성일매장입니다.");
			System.out.println("환영합니다. 소프트매장입니다.");
		}
		
		// 1부터 10까지 정수 중 짝수만 출력하시오.
		for (int i= 1; i<10; i =i+2) {
			System.out.println(i+1);
		}
		for (int i= 0; i<10; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		// i+=2 -> ㅑ=ㅑ+2
		for (int i= 2; i<=10; i+=2) {
			System.out.println(i);
		}
		// 거꾸로 10부터 1까지 출력!!
		//for (int i = 10; i>0; i-=1) {
			//System.out.println(i);
		for (int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		//1부터 100까지의 합을 구하시오.
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			sum+=i;
			System.out.println(sum);
		}
		
	}
}
