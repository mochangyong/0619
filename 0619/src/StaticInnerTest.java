class OuterClass2{
	private int outerVar=20;//OuterClass 클래스 멤버 변수를 정의한 부분이다.
	private static int outerStaticVar= 10;
	
	static class StaticInner{//내부 클래스를 정의하는 부분이다. 내부 클래스를 정의할 때 static을 지정하였으므로 static 변수처럼 다루어진다.
		//즉, 외부 클래스 객체를 생성하지 않아도 내부 클래스에 접근이 가능
		static int innerVar=30;//내부 클래스안에서 static 변수를 정의하고 있다. 내부 클래스에 static이 지정되어 있기 때문에 가능한 것이다.
		//인스턴스 내부 클래스에서는 static변수를 정의할 수 없다.
		public void printInfo(){
			//System.out.println("outerVar = "+outerVar);//static 내부클래스에스는 외부 클래스의 인스턴스 변수를 사용할 수 없ㄷ. 
			System.out.println("outerStaticVar =" +outerStaticVar);//static내부 클래스에서는 static변수에만 접근이 가능하다.
			System.out.println("innerVar="+innerVar);
		}
	}
}
public class StaticInnerTest {
/**
 * static 내부 클래스 테스트
 */
	public static void main(String[] args) {
		OuterClass2.StaticInner st = new OuterClass2.StaticInner();
		
		st.printInfo();
	}
}
