public class Test32 {
	int memVar;
	static int staticVar;
	void memMethod1(){
		int local = memVar;//인스턴스 메소드 안에서는 인스턴스 변수를 사용할 수 있다.
		local=staticVar;//인스턴스 메소드 안에서는 static변수를 사용할 수 있다. static 변수가 먼제 초기화되기 때문이자 즉 메모리에 먼저 존재하기 때문이다.
		staticMethod1();//인스턴스 메소드에서 static 메소드를 참조할 수 있다.
		memMethod2();//같은 클래스 안에 있는 인스턴스 메소드끼리는 상호 호출이 가능하다.
		System.out.println("memMethod1");
	}
	void memMethod2(){
		System.out.println("memMethod2");
	}
	static void staticMethod1(){
		//int local=memVar;//static 메소드에서는 인스턴스 변수를 참조할 수 없다. 주석을 해제하면 컴파일 오류가 발생한다.
		//memMethod1();//static 메소드 안에서는 인스턴스 메소드를 호출할 수 없다.
		Test32 st = new Test32();//static 메소드에서 인스턴스
		int local =st.memVar;//변수나 인스턴스 메소드를 사용하려면 
		st.memMethod2();//객체를 생성한 후 객체를 통해서 사용해야 한다.
		staticMethod2();//static 메소드 안에서 다른 static 메소드를 호출할 수 있다.
		System.out.println("staticMethod1");
	}
	static void staticMethod2(){
		System.out.println("staticMethod2");
	}
	/**
	 * Static Method 테스트
	 * 
	 */
	public static void main(String[] args) {
		//Test32.memMethod1();//인스턴스 메소드는 클래스 이름으로 바로 호출 할 수 없다.
		Test32 st= new Test32();//main 메소드 안에서 인스턴스 메소드를 호출하려면 
		st.memMethod1();//객체를 생성한 후 객체를 통해서 호출해야 한다.
		Test32.staticMethod2();//static 메소드는 객체를 생성할 필요 없이 클래스 이름을 이용하여 바로 호출이 가능 하다. 다른 클래스에서 호
								//출할 때도 클래스 이름만으로 바로 호출이 가능하다.
		staticMethod2();// 같은static 메소드 안에서는 static 변수를 참조할수 있다.
		int local = staticVar;//static 메소드 안에서는 static 변수를 참조할 수 있다.
		//local = memVar;//static 메소드 안에서는 인스턴스 변수를 참조할 수 없다.
	}
}
