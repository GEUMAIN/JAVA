package chap_06;

public class _06_whenToUse {
	
	//메소드 오버로딩
	public static int getPower(int number) {
//		int result = number * number;
//		return result;
		return getPower(number, 2); //메소드 안에서 다른 메소드 호출이 가능함!!
	}
	
	public static int getPower(int number, int exponet) {
		int result = 1;
		for (int i = 0; i < exponet; i++) {
			//result = result * number;
			result *= number;
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		//메소드가 필요한 이유
		//반복되는 코드의 중복을 줄일 수 있음
		//수정사항이 발생시 유지보수가 편함
		
		//2의 2 제곱을 구하기
		int result = 1;
		for (int i = 0; i<2; i++) {
			result = result * 2;
		}
		System.out.println("메인엥서 실행 : "+ result);
		System.out.println("메소드 호출하여 실행 : " + getPower(2,2));
		
		//3의 3제곱을 구하기
		result = 1;
		for (int i = 0; i<3; i++) {
			result = result * 3;
		}
		System.out.println("메인엥서 실행 : "+ result);
		System.out.println("메소드 호출하여 실행 : " + getPower(3,3));
		//4의 2제곱을 구하기
		result = 1;
		for (int i = 0; i<3; i++) {
			result = result * 3;
		}
		System.out.println("메인엥서 실행 : "+ result);
		System.out.println("메소드 호출하여 실행 : " + getPower(4,2));
	}
	
}
