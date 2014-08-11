public class Test28 {
	//인스턴스 멤버 변수
	int memVar;
	//static 멤버 변수
	static int staticVar;
/**
 * 변수 종류 테스트
 */
	public static void main(String[] args) {
		//로컬변수
		int localVar;
		
		Test28 vk1= new Test28();//vk1객처를 생성하는 부분이다 . 인스턴스 멤버 변수를 static 메소드 안에서 사용하려면 객체를 생성해야 한다.
								 //인스턴스 멤버 변수는 객체를 생성할 때 초기화 된다.
		System.out.println("vk1.memVar ="+vk1.memVar);//3라인에서 인스턴스 멤벼 변수를 선언할때 값을 초기화시키지 않았지만 인스턴스 멤버 변수는 값이 
													 //초기화되어 있지 않으면 컴파일러가 자동으로 해당 데이터 타입의 기본값으로 초기화 시켜 주기 때문에 
													 //0값을 출력된다
		System.out.println("vk1.staticVar = " +vk1.staticVar);//static 멤버 변수도 컴파일러에 의해서 자동으로 초기화되기 때문에 0 값이 출력된다.
		System.out.println("Test28.staticVar = " + Test28.staticVar);//static멤버변수는 클래스를 로딩할 때 바로 초기화되므로 클래스 이름으로
																	//접근할수 있다. 다른 클래스에서 접근할 경우에도 클래스 이름만으로 접근 가능
		System.out.println("staticVar =" +staticVar);//동일한 레벨인 static 메소드에서는 static 변수를 바로 접근할 수 있다. 둘 다 클래스 로딩 할때
													//바로 인식되기 때문이다
		Test28 vk2=new Test28();
		vk1.staticVar=20;//vk1레퍼런스 변수를 통해서 staticVar 변수에 20 값을 할당하였다.
		System.out.println("vk2.staticVar="+vk2.staticVar);//static 변수는 JVM Class Area의 static 영역에 초기화되며 모든 객체에서 공유하므로, vk2
														//의 staticVar값도 동일한 변수를 가리킨다. 따라서 vk1변수에 의해서 초기화시킨 20값이 출력된다.
//		System.out.println("localVar ="+localVar);
		//로컬변수는 변수 선언시 값을 초기화 하지 않으면 컴파일러가 값을 자동으로 초기화해 주는 것이 아니라 컴파일 오류가 발생한다. 따라서
		//27라인의 주석을 해제하면 컴파일 오류가 발생한다. 
//		System.out.println("staticVar = " + staticVar);
	}
	
}
