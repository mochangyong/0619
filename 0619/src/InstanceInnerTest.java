class OuterClass{
	private int outVar=10;//OutClass 클래스의  멤버 변수를 정의한 부분이다.
	private static int outStaticVar =20;
	
	class InnerClass{//InnerClass를 OuterClass의 멤버 내부 클래스로 정의한 부분이다. 멤버 레벨로 정의되었기 때문에 일반 멤버 변수와
		public void printInfo(){//같은 레벨로 인식된다. 컴파일 하게 되면 내부 클래스의 이름은 OuterClass$InnerClass로 생성된다.
			System.out.println("outVar =" +outVar);//OuterClass의 인스턴수 변수를 출력하는 부분이다. 인스턴스 내부 클래스도 멤버 
			//변수와 초기화 시점이 같기 때문에 , 즉 외부 클래스 객체가 생성될 때 초기화되기 때문에 인스턴스 내부 클래스는
			//외부 클래스의 인스턴스 멤버 변수를 사용할 수 있다.
			System.out.println("outStaticVar =" +outStaticVar);//외부클래스의 static 변수를 사용하는 부분이다. static이 인스턴스보다 초기화
			//시점이 더 빠르기 때문에 인스턴스 내부 클래스에서 외부 클래스의 static 변수를 사용할 수 있다. 내부 클래스에서는 외부 클래스의 변수가
			//private으로 지정되어 있어도 사용할 수 있다.
		}
	}
}//
public class InstanceInnerTest {
/**
 * 인스턴스 내부 클래스 테스트
 */
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();//내부클래스 객체를 생성할때는 반드시 외부 클래스 객체를 생성한 후에 생성할 수 있다.
		OuterClass.InnerClass in = oc.new InnerClass();
		
		in.printInfo();//내부클래스의 printInfo()메소드를 호출하는 부분이다.
	}
}
