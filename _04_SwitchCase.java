package chap_04;

public class _04_SwitchCase {
	public static void main(String[] args) {
		//Switch Case
		
		//석차에 따른 장학금 지급
		//1등 : 전액 장학금
		//2등 : 반액 장학금
		//3등 : 반액 장학금
		//그 외 : 장학금 대상 아님
		
		//if문으로 작성해보자!!!
		int grade= 4;
		if (grade ==1) {
			System.out.println("등수는 1등입니다. 전액 장학금 대상입니다");
		}else if (grade ==2) {
			System.out.println("등수는 2등입니다. 반액 장학급 대상입니다");
		}else if (grade ==3) {
			System.out.println("등수는 3등입니다. 반액 장학금 대상입니다");
		}else {
			System.out.println("등수는 그 외 장학금 대상이 아닙니다");
		}
		System.out.println("=========");
		
		//케이스가 명확한 경우에는 switch문을 사용하는 것을 고려해볼만 하다!!
		
		grade = 3;
		switch (grade) {
			case 1:
				System.out.println("등수는 1등입니다. 전액 장학금 대상입니다");
				break;
			case 2:
				System.out.println("등수는 2등입니다. 반액 장학급 대상입니다");
				break;
			case 3:
				System.out.println("등수는 3등입니다. 반액 장학금 대상입니다");
				break;
			default:
				System.out.println("등수는 그 외 장학금 대상이 아닙니다");
		}
		
		// case의 결과가 같을 경우 통합하는 방법
		switch (grade) {
		case 1:
			System.out.println("등수는 1등입니다. 전액 장학금 대상입니다");
			break;
		case 2:
		case 3:
			System.out.println("반액 장학금 대상입니다");
			break;
		default:
			System.out.println("등수는 그 외 장학금 대상이 아닙니다");
		}
		//break를 일부로 빼는 경우
		//중고상품을 등급에 따라 가격을 책정 (1급 : 최상, 4급: 최하)
		//등급별 천원씩 차등이 있어
		int grade2= 1;
		int price = 7000; // 기본가격 -> 최하기준
		switch (grade2) {
		case 1:
			price = price + 1000;
		case 2:
			price = price + 1000;
		case 3:
			price = price + 1000;
		}
		
		System.out.println(grade2 + "등급의 제품 가격 :" + price);
		//break를 빼도 결과가 같기 때문
	}
}
