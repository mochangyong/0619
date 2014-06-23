interface Interface1{
	int interVar=10;
	void interface1Method();
}
class Interface1Impl implements Interface1{
	@Override
	public void interface1Method() {
		System.out.println("interface1Method구현");
	}
	
}

public class InterfaceTest1 {
/**
 * 인터페이스 구현 테스트
 * 
 */
	public static void main(String[] args) {
		//Interface1 in1 = new Interface1();
		
		Interface1Impl in1Impl = new Interface1Impl();
		System.out.println("in1Impl.interVar =" +in1Impl.interVar);
		System.out.println("Interface1.interVar =" +Interface1.interVar);
		in1Impl.interface1Method();
	}
}
