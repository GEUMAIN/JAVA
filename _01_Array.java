package chap_05;

public class _01_Array {
	public static void main(String[] args) {
		//배열: 같은 자료형의 여러개의 값을 저장하는 연속된 공간
		//      자료를 순차적으로 관리하는 구조
		
		//학생100명의 ID를 부여할려고 함.
		int stuId01 = 11101;
		int stuId02 = 11101;
		int stuId03 = 11103;
		
		int stuId100 =31530;
		
		int stuId[] = new int[100];
		stuId[0] = 11101;
		stuId[1] = 11102;
		stuId[99] = 31530;
		
		String coffeeRoss = "아메리카노";
		String coffeeRachel = "카페모카";
		String coffeeChandler = "라떼";
		String coffeeMonica = "카푸치노";
		
		System.out.println(coffeeRoss + " 하나");
		System.out.println(coffeeRachel + " 하나");
		System.out.println(coffeeChandler + " 하나");
		System.out.println(coffeeMonica + " 하나");
		System.out.println("주세요!");
		
		//배열 선언 첫 번째 방법!
		//데이터타입[] 변수이름 = new 데이터타입[배열의 크기];
		//데이터타입 변수이름[] = new 데이터타입[배열의 크기];
		//배열은 선언때 크기가 무조건 정해져야 한다!!
		String str = new String();
		
		String[] coffees = new String[4];
		//String coffees2[] = new String[4];
		
		// 선언된 배열의 값 할당!
		coffees[0] = "아메리카노";
		coffees[1] = "카페모카";
		coffees[2] = "라떼";
		coffees[3] = "카푸치노";
		
		//배열 선언 및 할당
		String coffees3[] = new String[] {"아메리카노","카페모카","라떼","카푸치노"};
		//String coffees4[] = new String[4] {"아메리카노","카페모카","라떼","카푸치노"}; 불가!

		//배열 선언 및 할당2
		String coffees4[] = {"아메리카노","카페모카","라떼","카푸치노"};
		
		System.out.println(coffees[0]);
		System.out.println(coffees[1]);
		//라떼 -> 에소프레소
		coffees[2]= "에소프레소";
		System.out.println(coffees[2]);
		System.out.println(coffees[3]);
		System.out.println("주세요!");
		
		// 배열 선언 및 할당시 주의점!
		//배열의 데이터타입과 이름만 선언은 가능함!
		//단, 타입과 이름만으로 선언하는 경우 값을 할당할 때, new String[] 룰 생략할 수 없다!
		String[] coffees6;
		//coffees6 = {"아메리카노","카페모카","라떼","카푸치노"}; 불가!
		coffees6 = new String[] {"아메리카노","카페모카","라떼","카푸치노"};
		
		// 다른 자료형?
		int[] i = new int[3];
		i[0] = 3;
		i[1] = 7;
		i[2] = 9;
		double[] d = new double[] {10.0, 12.5, 19.2};
		boolean[] b = {true, true, false};
	}
}
