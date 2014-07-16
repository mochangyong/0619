import java.io.FileWriter;
import java.io.IOException;


public class FileWriterTest {
/**
 * FileWriter 테스트
 */
	public static void main(String[] args) {
		FileWriter fw = null;
		String msg ="FileWriter 테스트입니다.\r\n";//파일에 출력할 메시지를 지정한 부분이다. 문자열 맨 뒤에 \r\n을 추가하여 줄 바꿈이 되게 처리하고 있다.
		try{
			fw = new FileWriter("fileWriter.txt",true);//FileWriter 객체를 생성하는 부분이다. 두번째 인자를 true로 설정하여 여러 번 실행 하면 기존 파일의 
			//내용에 새로 출력하는 내용을 추가하는 방식으로 쓴다.
			fw.write(msg);//파일에 문자열을 출력하는 부분이다.
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
