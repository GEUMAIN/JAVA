package chap_06;

import java.util.Scanner;

public class _Prog_Calculator {
	
	public static int plus(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		
		return result;
		
	}
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		
		return result;
	}
	
	public static double divide(int num1, int num2) {
		if(num2 == 0) System.out.println("분모에 0이 들어올 수 없다");
		double result = (double)num1 / num2;
		
		return result;
	}
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 : ");
		int num2 = sc.nextInt();
		System.out.println("연산자 종류(+,-,*,/) : ");
		String oper = sc.next();
		
		switch(oper){
		case "+": System.out.println(plus(num1,num2));
		break;
		case "-": System.out.println(minus(num1,num2));
		break;
		case  "*":System.out.println(mul(num1,num2));
		break;
		case "/":System.out.println(divide(num1,num2));
		break;
		}
			
	}
}
