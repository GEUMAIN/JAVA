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
		String[] p1 = {
				"", //[0]
				"","","","", //[1~4]
				"",//[5]
				"","","","", //[6~9]
				"",//[10]
				"","","","",//[11~14]
				"",//[15]
				"","","",""//[16~19]
				};
		String[] p2 = {
				"", //[0]
				"","","","", //[1~4]
				"",//[5]
				"","","","", //[6~9]
				"",//[10]
				"","","","",//[11~14]
				"",//[15]
				"","","",""//[16~19]
				};
//		System.out.println(m[10]+" "+m[9]+" "+m[8]+" "+m[7]+" "+m[6]+" "+m[5]);
//		System.out.println(m[11]+"	  "+m[4]);
//		System.out.println(m[12]+"	  "+m[3]);
//		System.out.println(m[13]+"	  "+m[2]);
//		System.out.println(m[14]+"	  "+m[1]);
//		System.out.println(m[15]+" "+m[16]+" "+m[17]+" "+m[18]+" "+m[19]+" "+m[0]);
		Scanner sc = new Scanner(System.in);
		viewMap(m,p1,p2);
		System.out.println("플레이어1 이름을 입력해주세요");
		String p1Name = sc.next();
		System.out.println("플레이어2 이름을 입력해주세요");
		String p2Name = sc.next();
		int p1pos = 0;
		int p2pos = 0;
		while (true) {
			System.out.print("플레이어1 몇칸 이동하실 건가요?[0 ~ 19까지] : ");
			p1pos =move(p1,p1Name,p1pos,sc.nextInt());
			System.out.print("플레이어2 몇칸 이동하실 건가요?[0 ~ 19까지] : ");
			p2pos =move(p2,p2Name,p2pos,sc.nextInt());
			viewMap(m,p1,p2);
		}
	}
	
	public static void viewMap(String[] m,String[] p1,String[] p2) {
		System.out.println("===========================================");
		System.out.printf("%s%s%s \t %s%s%s \t %s%s%s \t %s%s%s \t %s%s%s \t %s%s%s \n",p1[10],m[10],p2[10],p1[9],m[9],p2[9],p1[8],m[8],p2[8],p1[7],m[7],p2[7],p1[6],m[6],p2[6],p1[5],m[5],p2[5]);
		System.out.println();
		System.out.println();
		System.out.printf("%s%s%s \t \t \t \t \t %s%s%s \n",p1[11],m[11],p2[11],p1[4],m[4],p2[4]);
		System.out.println();
		System.out.println();
		System.out.printf("%s%s%s \t \t \t \t \t %s%s%s \n",p1[12],m[12],p2[12],p1[3],m[3],p2[3]);
		System.out.println();
		System.out.println();
		System.out.printf("%s%s%s \t \t \t \t \t %s%s%s \n",p1[13],m[13],p2[13],p1[2],m[2],p2[2]);
		System.out.println();
		System.out.println();
		System.out.printf("%s%s%s \t \t \t \t \t %s%s%s \n",p1[14],m[14],p2[14],p1[1],m[1],p2[1]);
		System.out.println();
		System.out.println();
		System.out.printf("%s%s%s \t %s%s%s \t %s%s%s \t %s%s%s \t %s%s%s \t %s%s%s \n",p1[15],m[15],p2[15],p1[16],m[16],p2[16],p1[17],m[17],p2[17],p1[18],m[18],p2[18],p1[19],m[19],p2[19],p1[0],m[0],p2[0]);
		System.out.println("===========================================");
	}
	public static int move(String[] p,String p_Name,int p_pos,int kan) {
		p[p_pos] = "";
		p_pos = p_pos + kan;
		if (p_pos > 20) {
			System.out.println("골인");
			System.exit(0);
		}else if (p_pos == 20){
			p[0] = p_Name;
		}else {
			p[p_pos] = p_Name;
		}
		
		return p_pos;
	}
	
	
}