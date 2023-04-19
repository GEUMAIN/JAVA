package chap_03;

//"901231-1234567" 인 경우 "901231-1"까지만 출력
//"030109-4574891" 인 경우 "030109-4" 까지만 출력
public class _Quiz_03 {
	public static void main(String[] args) {
		String id="901231-1234567";
		String id2="030109-4574891";
		//System.out.println(id.substring(id.indexOf("9"),id.lastIndexOf("2")));
		//System.out.println(id2.substring(id2.indexOf("0"),id2.lastIndexOf("5")));
		System.out.println(id.substring(0,id.indexOf("-")+2));
		System.out.println(id2.substring(0,id.indexOf("-")+2));
	}
}
