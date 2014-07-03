import java.util.Scanner;


public class LoginMain {
/**
 * 로그인 테스트
 */
	public static void main(String[] args) {
		boolean isStop = false;//do~while문을 계속 실행 할 지를 판단하는 변수를 정의하였다. 이 값이 true가 되면 반복문 실행을 중지한다.
		Scanner sc = new Scanner(System.in);//Scanner 객체를 생성하는 부분이다.
		LoginSVC loginSVC = new LoginSVC();//LoginSVC 객체를 생성하는 부분이다.
		
		do{
			System.out.println("로그인 화면입니다.");
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.println("아이디:");
			String id = sc.next();//콘솔로부터 사용자가 입력한 아이디를 읽어 들이는 부분이다.
			System.out.println("비밀번호:");
			String passwd = sc.next();//콘솔로부터 사용자가 입력한 비밀번호를 읽어 들이는 부분이다.
			
			User user = loginSVC.login(id,passwd);//아이디와 비밀번호를 인자로 던지면서 로그인 처리를 하는 메소드를 호출하는 부분이다. 로그인에 성공
			//하면 로그인에 성공한 사용자의 정보가 User타입으로 리턴되고, 로그인에 실패하면 null 이  넘어온다. 
			if(user == null){//인증이 실패 되었을때 실패 메시지를 출력하고  아이디와 비밀번호를 계속 물어 보게 처리하는 부분이다.
				System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
			}else{//인증에 성공했으면 해당 사용자의 정보를 출력해 주고 반복문을 빠져나오게 된다.
				System.out.println("로그인한 사용자 정보");
				System.out.println(user);
				isStop=true;
			}
		}while(!isStop);
				
	}
}
