class Good{
	{
		System.out.println("good의 인스턴스 초기화 블록 실행");//인스턴스 초기화 블록을 정의함 , 객체를 생성할 때마다 반복적으로 호출된다.
	}
	static{//static 초기화 블록을 정의함 , 클래스가 로딩될때 한 번만 실행 된다.
		System.out.println("good의 static 초기화 블록 실행");
	}
	
}
public class InitailBlockTest {
/**
 * Initial block test
 */
	public static void main(String[] args) {// 객체를 생성하고 메시지를 출력하는 부분이다.
		Good g1 = new Good();
		Good g2 = new Good();
		Good g3 = new Good();
		System.out.println("main");
	}
}
