package test;

public class Ex08 {
	
	//주사위 2개를 던져서 합이 6이 되는 경우를 모두 출력하시오
	public static void main(String[] args) {
		int cnt = 0;
		for(int i =1; i<=6; i++) {
			for(int j =1; j<=6; j++) {
				if (i+j == 6) {
					System.out.println(i+" "+j +" 가능");
					cnt++;
					continue;
				}
			}
		}
		System.out.println("정답인 경우 수= " + cnt);
		System.out.println("====================================");
		int cnt2 = 0;
		//주사위 3개를 던져서 합이 10이 되는 경우를 모두 출력
		for ( int k =1; k<=6; k++) {
			for (int z =1; z<=6; z++) {
				for(int q =1; q<=6; q++) {
					if(k+z+q == 10) {
						System.out.println(k+" "+z+" "+q+" 가능");
						cnt2++;
					}
				}
			}
		}
		System.out.println("정답인 경우 수= " + cnt2);
	}
}
