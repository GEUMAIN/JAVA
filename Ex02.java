package arrayTest;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//10칸짜리 정수형 배열 선언 - nums
		int[] nums = new int[10];
		//스캐너 선언
		Scanner sc = new Scanner(System.in);
		//반복문을 이용해서 임의의 정수값 10개 넣기
		for(int i =0; i<nums.length; i++) {
			System.out.println(i+"번째 배열 입력");
			nums[i] = sc.nextInt();
		}
		// 3칸짜리 정수형 배열 선언 - except
		int[] except = new int[3];
		//except 배열에 1부터 10까지의 숫자 중 임의의 숫자 3개 입력
		for (int i =0; i<except.length; i++) {
			System.out.println(i+"번째 1부터 10까지 임의의 배열 입력");
			except[i] = sc.nextInt();
					}
		//except 배열에 있는 숫자번째에 해당하는 nums 배열의 값을 출력
		//예를 들어 3,6,9면 nums에 3번째 6번째 9번째 값을 출력
		for (int i = 0; i<nums.length; i++) {
			if((i+1) == except[0] || (i+1) == except[1] || (i+1) == except[2]) {
				System.out.print(nums[i]+ " ");
			}

		}
	}			
}
