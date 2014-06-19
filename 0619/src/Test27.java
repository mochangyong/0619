
public class Test27 {
	/**
	 * 객체의 변수와 메소드 사용 테스트
	 * @param args
	 */
	public static void main(String[] args) {
		Test26 t=new Test26();
		
		//변수 사용
		t.color="white";
		t.temp=10;
		t.price=10000;
		
		//메소드 사용
		t.tempUp();
		System.out.println("t.temp ="+t.temp+",t.color="+t.color);
	}
}
