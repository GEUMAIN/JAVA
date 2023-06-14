package chap_07;

public class _04_Method {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
//		System.out.println(b1.canAutoReport);
		
		b1.AutoReport();
		BlackBox.canAutoReport = true;
		b1.AutoReport();
			
		b1.insertMemoryCard(512);
		//자동 충돌 감지 업데이트 완료
		
		
	}
}
