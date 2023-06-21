package chap_07;

//클래스 구성요소 : 필드, 생성자, 메소드
public class BlackBox {
	
	//필드
	//인스턴스 필드 - 각 객체 안에서 사용되는 필드
	
	String modelname; //모델명
	String resolution; //해상도
	int price; //가격
	String color; // 색상
	
	//클래스 메소드 - 모든 객체에 공통적으로 적용하는 필드
	static boolean canAutoReport = true; //자동 신고 기능
	
	//생성자
	//아래와 같이 빈 코드를 갖는 생성자를 기본생성자라고 함.
	//게발자를 생성자를 따로 스지 않은 경우에는 잡자가 자동으로 기본생성자를 생성해 줌.
	public void BlackBox() {}
	
	//메소드
	//기능을 담당!
	//클래스 메소드 - 모든 객체에 공통적으로 적용하는 필드
	
	// 인스턴스 메소드 - 해당 객체에서만 사용할 수 있는 메소드!
	void autoReport() { //파리미터 X, 리턴값 X
		if (canAutoReport == true) {
			System.out.println("충돌이 감지되어 자동으로 신고합니다.");
		}else {
			System.out.println("자동 신고 기능이 지원되지 않습니다.");
		}
	}
	
	void insertMemoryCard(int capacity) { // 파라미터 O, 리턴값 X
		System.out.println("메모리 카드가 삽입되었습니다.");
		System.out.println("용량은 "+capacity + "GB 입니다.");
	}
	
	int getVideoFileCount(int type) { //파라미터 O, 리턴값 O
		if (type == 1) { //일반 영상
			return 9;
		}else if (type == 2) { //이벤트 영상
			return 2;
		}else {
			return 11;
		}
	}
	
	// showDateTime : 날짜/시간 정보
	// showSpeed : 속도
	// min : 영상 기록 단위
	void record(boolean showDateTime, boolean showSpeed, int min) {
		System.out.println("녹화를 시작합니다.");
		if (showDateTime == true) {
			System.out.println("영상의 날짜/시간 정보가 표시됩니다.");
		}
		if (showSpeed == true) {
			System.out.println("영싱에 속도 정보가 표시됩니다.");
		}
		System.out.println("영상은 "+min+"분 단위로 기록됩니다.");
	}
	
	//오버로딩 : 파라미터의 갯수가 다르다
	void record(int min) {
		record(true,true,min);
	}
	void reocrd() {
		record(true,true,5);
	}
	
	static void callServiceCenter() {
		System.out.println("서비스센터(1588-0000)으로 연결합니다.");
		canAutoReport = false;
	}
}
