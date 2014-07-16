import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputStreamReaderTest {
/**
 * InputStreamReader 테스트
 */
	InputStreamReader isr = null;
	BufferedReader bfr = null;
	
	public static void main(String[] args) {
		InputStreamReaderTest isrt = new InputStreamReaderTest();
		
		User1 user = isrt.getUserInfo();//사용자 한명에 대한 정보를 콘솔로부터 입력받아 User 한 명의 정보를 리턴해 주는 getUserInfo()메소드를 호출
		//하는 부분이다
		System.out.println("입력한 사용자 정보");
		System.out.println(user);//user 정보를  출력하는 부분이다. user 객체를 System.out.println()메소드의 파라미터로 지정했기 때문에 user
		//객체의 toString()메소드가 자동으로 호출된다.
	}

	private User1 getUserInfo() {
		User1 user = null;
		
		isr = new InputStreamReader(System.in);//콘솔로부터 데이터를 바이트 단위로 읽어 들이는 System.in 객체를 InputStreamReader클래스를 이용해
		//Reader로 변환해 주는 부분이다.
		bfr = new BufferedReader(isr);//데이터를 라인 단위로 편리하게 읽을 수 있는 BufferedReader 객체를 생성하는 부분이다.
		
		try{
			System.out.println("사용자 정보를 입력하세요");//사용자의 정보를 콘솔로 붙너 읽어 들여 각 변수에 저장하는 부분이다.
			System.out.println("아이디");
			String id = bfr.readLine();
			System.out.println("비밀번호:");
			String passwd = bfr.readLine();
			System.out.println("동:");
			String dong = bfr.readLine();
			System.out.println("나이:");
			int age = Integer.parseInt(bfr.readLine());
			System.out.println("이름:");
			String name = bfr.readLine();
			user = new User1(id,passwd,dong,age,name);//콘솔에서 입력받은 데이터들을 이용해서 User 객체를 생성하는 부분이다.
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				isr.close();
				bfr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return user;
	}
	
}
