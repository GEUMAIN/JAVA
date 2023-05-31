package arrayTest;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//5칸 정수형 배열을  생성한 후
		//아무 정수나 5개나 입력 받아 출력하시오.
		
		//배열 5칸짜리 정수형 배열 생성
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		//배열 순회하는 방법 - 입력
		for (int i = 0; i<arr.length; i++) {
			System.out.println(i +"번째 배열의 값 입력");
			arr[i]=sc.nextInt();
		
		}
		//배열 순회하는 방법 - 출력
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		// 항상된 for문
		System.out.println();
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
	}
}
