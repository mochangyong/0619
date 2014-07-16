import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ReadAddress {
/**
 * 주소 정보 출력하기
 */
	public static void main(String[] args) {
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr= null;
		StringTokenizer st = null;//StringTokenizer 클래스 변수를 정의한 부분이다.
		
		try{
			fi = new FileInputStream("address.txt");
			isr = new InputStreamReader(fi);
			bfr = new BufferedReader(isr);
			
			String str = null;//파일에서 한 라인 읽어 들인 문자열을 저장할 변수를 정의한 부분이다.
			while((str = bfr.readLine())!=null){
				st = new StringTokenizer(str, ",");//파일에서 읽어 들인 문자열을 , 문자로 분리해서 토큰을 반환해 주는 StringTokenizer 객체를 생성
				System.out.println("이름:"+st.nextToken()+",주소"+st.nextToken()+",이메일:"+st.nextToken()+",전화번호:" 
						+st.nextToken());//파일에서 읽어 들인 각 단위의 정보들을 출력하는 부분이다.
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
