
public class WriteComand implements Command{

	@Override
	public void execute() {
		System.out.println("글을 새로 작성한다.");
	}//글쓰기 요청이 들어왔을 때 요청을 처리하는 메소드를 구현하는 클래스를 Command 인터페이스를 구현해서 정의

}
