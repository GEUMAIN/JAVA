package test;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1부터 10까지의 수 중에서 랜덤으로 뽑기
		int range =10;
		int start = 1;
		int a=0,b=0,c=0;
		
		//찐문제
		//1부터 10까지의 정수를 랜덤으로 뽑아오는데 세 개의 수가 서로 겹치지 않ㄷ록 출력하시오 
		
		//0.0 ~ 0.9999999
		//10을 곱할시 0.0 ~ 9.999999
		// 1을 더할시 1.0 ~ 10.999999
		// int로 캐스팅 하고 11을 곱하면
		//1~10
		while (a==b || b==c || c==a) {
			a = (int)(Math.random()*range+start);
			b = (int)(Math.random()*range+start);
			c = (int)(Math.random()*range+start);
		}
		System.out.printf("%d,%d,%d",a,b,c);
	}
}
