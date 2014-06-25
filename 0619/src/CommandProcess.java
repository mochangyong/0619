
public class CommandProcess {
	public void process(Command command){
		command.execute();
	}
}
/*
 * 실질적으로 요청을 받아서 처리해 주는 클래스이다. ㅖ갳ㄷㄴㄴ 메소드에서 파라미터를 Command 인터페이스 형태로
 * 받아서 가 Command 인터페이스를 구현한 클래스의 execute()메소드를 호출해서 요청을 처리해준다.
 * */
