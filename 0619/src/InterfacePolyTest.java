
public class InterfacePolyTest {
/**
 * 인터페이스 다형성 테스트
 */
	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		
		WriteComand wc=new WriteComand();//Command 인터체이스를 구현해서 글쓰기 요청과 목록 보기 요청을 처리하는 
		ListCommand lc= new ListCommand();//execute()메소드를 구현한 클래스 객체들을 생성한 부분이다.
		
		cp.process(wc);//각 WriteCommand클래스 객체와 ListCommand클래스 객체를 파라미터로 전송하면서 CommandProcess 클래스의 process 메소드를 호출한다
		cp.process(lc);//그렇게 되면 CommandProcess 클래스의 process메소드에서 각 요청을 처리하는 Command 객체의 execute메소드가 호출된다. 
		
	}
}
