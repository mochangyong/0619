import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderTest {
/**
 * BufferedReader 테스트
 */
	public static void main(String[] args) {
		FileInputStream fi = null;//필요한 스트림 클래스들의 변수들을 선언한 부분이다.
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		
		try{
			fi = new FileInputStream("bufferReader.txt");//FileInputStream 객체를 생성하는 부분이다.
			isr = new InputStreamReader(fi);//InputStreamReader 객체를 생성하는 부분이다. InputStreamReader 클래스는 파라미터로 지정된
			//InputStream 을 이용해서 Reader 객체를 생성해 주는 클래스이다. BufferedReader 클래스에서 요구하는 파라미터가 Reader타입이므로
			//FileInputStream객체 타입을 Reader 타입으로 변경해 주는 것이다. 
			bfr = new BufferedReader(isr);//BufferedReader 객체를 생성하는 부분이다.
			
			String str = null;
			while((str = bfr.readLine())!= null){//파일로 붙너 데이터를 한 라인씩 읽어서 출력하는 부분이다.
				System.out.println(str);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fi.close();
				isr.close();
				bfr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
