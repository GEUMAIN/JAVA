package chap_06;

public class _Quiz_6 {
	//실행결과
	//이름 : 김**
	//주민등록번호 : 990130-1*****
	//전화번호 : 010-1234-****
	
//	substring() : 문자열 자르기
//	length()  : 문자열 길이
	
	public static String getHiddenData(String data, int index) {
//인터넷
//		String str = data.substring(index); //data를 받으면 index 값 이후만큼 잘라낸다 예:성일,1234567,5678
//		String hiddenStr = str.replaceAll("[성일]", "*"); // 성일을 다 *로 바꾸기
//		String hiddenNum = hiddenStr.replaceAll("[0-9]", "*"); //0~9까지를 다 *로 바꾸기
//		
//		String front = data.substring(0, index); //0부터 index값 까지 자르기
//
//		return front + hiddenNum; //그럼 이제 이값을 0부터 index값 까지 잘린 김,990130-1,010-1234-가 있고, hiddden에는 다 값만큼 바뀐 *들이 있으니 이걸 다 더하면
//수업
		String hiddenData = data.substring(0,index);
		for (int i = 0; i<data.length() - index; i++) {
			hiddenData += "*";
		}
		return hiddenData;
	}
	
	public static void main(String[] args) {
		String name = "김성일";
		String id = "990130-1234567";
		String phone = "010-1234-5678";
		
		System.out.println("이름 : " + getHiddenData(name,1));
		System.out.println("주민등록번호 : " + getHiddenData(id,8));
		System.out.println("전화번호 : " + getHiddenData(phone,9));
		
	}
}
