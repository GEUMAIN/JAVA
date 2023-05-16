package exam;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		//체중과 키를 활요하여 비만도(bmi)를 계산할 수 있다.
		//체중이 70이고 키가 1.7일 떄의 비만도 측정 결과는?
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요");
		double height = sc.nextDouble();
		height = height / 100;
		
		System.out.println("몸무게를 입력하세요.");
		double weight = sc.nextDouble();
		
		System.out.println("키 :" +height +", 몸무게 :" +weight);
		double bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("저체중");
		}else if (bmi < 24.9) {
			System.out.println("건강");
		}else if (bmi < 29.9) {
			System.out.println("과체중");
		}else if ( bmi > 30) {
			System.out.println("비만");
		}else {
			System.out.println("오류");
		}
	}
}
