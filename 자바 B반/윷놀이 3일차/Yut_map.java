package yut_play;

import java.util.Scanner;

public class Yut_map {
	public static void main(String[] args) {
		String[] m = {
				"■", //[0]
				"○","○","○","○", //[1~4]
				"■",//[5]
				"○","○","○","○", //[6~9]
				"■",//[10]
				"○","○","○","○",//[11~14]
				"■",//[15]
				"○","○","○","○"//[16~19]
				};
//		System.out.println(m[10]+" "+m[9]+" "+m[8]+" "+m[7]+" "+m[6]+" "+m[5]);
//		System.out.println(m[11]+"	  "+m[4]);
//		System.out.println(m[12]+"	  "+m[3]);
//		System.out.println(m[13]+"	  "+m[2]);
//		System.out.println(m[14]+"	  "+m[1]);
//		System.out.println(m[15]+" "+m[16]+" "+m[17]+" "+m[18]+" "+m[19]+" "+m[0]);
		Scanner sc = new Scanner(System.in);
		viewMap(m);
		System.out.println("플레이어 이름을 입력해주세요");
		String p1Name = sc.next();
		int p1pos = 0;
		while (true) {
			System.out.print("몇칸 이동하실 건가요?[0 ~ 19까지] : ");
			
			p1pos = p1pos + sc.nextInt();
			
			if (p1pos > 20) {
				System.out.println("골인");
				break;
			}else if (p1pos == 20){
				m[0] = p1Name;
			}else {
				m[p1pos] = p1Name;
			}
//			boolean값을 하나 만들어서 이동하면 true로 바꿔주고 아래 코드가 true인걸 감지해서 작동해주고 작동한 후 다시 false로 바꿔주기
			
			
//			if(p1pos % 5 == 0) {
//			m[p1pos] = "■";
//		}else {
//			m[p1pos] = "○";
//		}
			viewMap(m);
		}
	}
	
	public static void viewMap(String[] m) {
		System.out.println("===========================================");
		System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \n",m[10],m[9],m[8],m[7],m[6],m[5]);
		System.out.println();
		System.out.println();
		System.out.printf("%s \t \t \t \t \t %s \n",m[11],m[4]);
		System.out.println();
		System.out.println();
		System.out.printf("%s \t \t \t \t \t %s \n",m[12],m[3]);
		System.out.println();
		System.out.println();
		System.out.printf("%s \t \t \t \t \t %s \n",m[13],m[2]);
		System.out.println();
		System.out.println();
		System.out.printf("%s \t \t \t \t \t %s \n",m[14],m[1]);
		System.out.println();
		System.out.println();
		System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \n",m[15],m[16],m[17],m[18],m[19],m[0]);
		System.out.println("===========================================");
	}
	
}