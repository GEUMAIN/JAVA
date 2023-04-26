//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력
//2*1=2
//2*2=4
package chap_04;

public class _ex_02 {
	public static void main(String[] args) {
		Loop1:
		for (int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==i+1) continue Loop1;
				System.out.println(i + "*" +j + "="+(i*j));
			}
		}
	}
}
