
public class Test30 {
/**
 * Variable Argument Test
 */
	void printInfo(String...infos){//파라미터를 가변적으로 받아서 처리할수 있는 메소드를 정의 하였다
		if(infos.length !=0){//파라미터가 하나라도 넘어 왔을 때만 for문을 실행하면서 파라미터 값을 출력하도록 정의한 부분이다.
			for(int i=0; i<infos.length; i++){
				System.out.println(infos[i]);
			}
			
		}else{//파라미터가 하나라도 넘어오지 않았을 경우 메시지를 출력해 주는 부분이다.
			System.out.println("인자가 없네요");
		}
	}
	public static void main(String[] args) {//인자의 개수를 변경하면서 printInfo 메서드를 호츨하는 영역이다.
		Test30 vt = new Test30();
		System.out.println("인자 없이");
		vt.printInfo();
		System.out.println("인자 하나");
		vt.printInfo("모창용");
		System.out.println("인자 두개");
		vt.printInfo("모창용","개발부");
		System.out.println("인자 세개");
		vt.printInfo("모창용","개발부","30억");
	}//***파라미터라는 용어와 인자라는 용어는 혼용해서 사용하는 경우가 많지만 정확히 표현하면 호출하는 쪽에서 던져주는 값을 인자, 받는 쪽의 값을 파라미터라고 부른다
}
