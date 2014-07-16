import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterTest {
/**
 * BufferedWriterTest 테스트
 */
	public static void main(String[] args) {
		FileWriter filew = null;
		BufferedWriter buW = null;
		
		try{
			filew = new FileWriter("bufferWriter.txt");
			buW = new BufferedWriter(filew,4);//FileWriter 객체를 생성하는 부분이다. 버퍼 사이즈를 4로 지정하였다. 따라서 문자보다 많이 출력
			//할때만 자동 flush가 된다.
			buW.write('A');//출력 스트림으로 4문자를 출력하느는 부분이다. 버퍼 사이즈를 넘지 않아서 자동 flush가 되지 않는다.
			buW.write('B');
			buW.write('C');
			buW.write('D');
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
