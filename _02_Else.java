package chap_04;

/*
 * if (조건식){
 *  //조건식이 true일 때 실행되는 코드
 *  }
 *  
 * if (조건식){
 * 	//조건식이 true일 때 실행되는 코드
 * } else {
 * 	//조건식이 false일 때 실행되는 코드
 * }
 */
public class _02_Else {
	public static void main(String[] args) {
		int hour =14;
		
		if (hour < 14) {
			System.out.println("아메리카노 1+1");
		}
		if (hour >= 14) {
			System.out.println("카페라떼 1+1");
		}
		if ( hour < 14) {
			System.out.println("아메리카노 1+1");
		} else {
			System.out.println("카페라떼 1+1");
		}
		//실행되는 코드가 1개일 때는 {} 생략이 가능하다
		if (hour < 14) System.out.println("아메리카노 1+1");
		else System.out.println("카페라떼 1+1");
	}
}




