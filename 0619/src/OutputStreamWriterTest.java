import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class OutputStreamWriterTest {
/**
 * OutputStreamWriter 테스트
 */
	public static void main(String[] args) {
		FileOutputStream fileOutputs = null;
		OutputStreamWriter outWrier = null;
		BufferedWriter buffw = null;
		
		try{
			fileOutputs = new FileOutputStream("outputStrea.txt");//FileOutputStream 객체를 생성하는 부분이다
			outWrier = new OutputStreamWriter(fileOutputs);//OutputStreamWriter 객체를 생성하는 부분이다
			buffw = new BufferedWriter(outWrier);//BufferedWriter 객체를 생성하는 부분이다.
			buffw.write("OutputStreamWriter 테스트");//파일에 데이터를 출력하는 부분이다.
			buffw.newLine();	
			buffw.write("OutputStreamWriter 테스트");
			buffw.newLine();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				 buffw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			}
	}
}
