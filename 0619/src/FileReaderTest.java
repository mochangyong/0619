import java.io.FileReader;
import java.io.IOException;


public class FileReaderTest {
/**
 * FileReader 테스트
 */
	public static void main(String[] args) {
		FileReader fr = null;//파일에서 데이터를 문자 단위로 읽을수 있는 fileReader클래스의 레퍼런스 변수를 정의한 부분이다.
		
		try{
			fr = new FileReader("fileReader.txt");//FilieReader 객체를 생성한 부분이다.
			int readChar=-1;//파일에서 읽어 들인 문자 코드 값을 저장할 변수의 초기값을 -1로 설정하는 부분이다.
			while((readChar=fr.read())!= -1){
				System.out.print((char)readChar);//파일에서 읽어 들인 문자들을 출력하는 부분이다.
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
