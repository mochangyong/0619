//Command 인터페이스, CommandProcess 클래스가 존재하여야 본 예제가 실행 된다.
public class AnonymousInnerTest {
/**
 * 익명 내부 클래스 사용
 */
	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();//CommandProcess 객체를 생성하는 부분이다.
		cp.process(new Command() {
			
			@Override
			public void execute() {
				System.out.println("내용보기 실행");
			}
		});//내용보기 처리를 하는 execute()메소드를 정의하는 익명 내부 클래스 객체를 생성해서 CommandProcess 클래스의 process 메소드의 파라미터로 던져주는 부분이다.
	}
}
