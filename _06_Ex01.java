package chap_05;

public class _06_Ex01 {
	public static void main(String[] args) {
		// alphabets 이라는 배열을 만든다.
		//데이터타입 - char
		//배열의 크기 -26
		char[] alphabets = new char[26];
		char ch = 'A';
		//배열에 A부터 Z까지 반복문을 이용하여 할당!
		for (int i=0; i<alphabets.length; i++,ch++) {
			alphabets[i]=ch;
			System.out.println(alphabets[i]);
		}
		// 항상된 for문(for each) 사용하여 출려하는데,
		//A,65
		//B,66
		//C,67
		//...
		//Z,90
		
		//내가 출력하려는 배열이 무엇이냐? -alphabets[]
		// 그 배열의 타입이 뭐냐? - char
		System.out.println("=========================");
		for (char alphabet : alphabets) {
			System.out.println((char)alphabet+ ","+ (int)alphabet);
		}
	}
}
