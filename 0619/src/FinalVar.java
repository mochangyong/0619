class VarClass{
	final int x;//final앞에 static 예약어가 지정되지 않았으므로 객체마다 할당되는 상수를 정의하였다 생성되는 객체 안에서 
	//공유되는 상수로 생성자에서 값을 초기화 시킬수 있다
	static final int y = 100;//해당클래스를 사용하는 모든 객체에서 공유되는 상수를 정의하였다.
	public VarClass(int x){
		this.x=x;
	}
}
public class FinalVar {
/**
 * final 변수 사용 테스트
 */
	public static void main(String[] args) {
		
		//VarClass.y=30;
		VarClass vc1 = new VarClass(10);
		//vc1.y=50;
		//vc1.x=40;
		VarClass vc2 = new VarClass(20);
		//vc1.y=70;
		//vc1.x=80;
	} 
	
}
