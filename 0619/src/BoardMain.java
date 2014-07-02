import java.util.Scanner;


public class BoardMain {
/**
 * 게시판 예제 
 */
	public static void main(String[] args) {
		boolean isStop = false;//do~while문장 실행을 중단할지를 중단할지를 지정하는 변수를 정의하였다. 초기값을 false로 지정하여 반복문이 계속 실행되게처리
		Scanner sc = new Scanner(System.in);//Scanner 객체를 생성한 부분이다. Scanner객체를 이부분에서 한 번 생성해서 공유하게 된다.
		BoardSVC boardSVC= new BoardSVC();
		
		do{
			System.out.println("메뉴를 입력하세요");//사용자가 요청할 수 있는 메뉴 항목을 손솔 화면에 안내하는 부분이다.
			System.out.println("1,게시판 글쓰기");
			System.out.println("2.게시판 목록 보기");
			System.out.println("3.글 삭제");
			System.out.println("4.종료");
			
			String menu = sc.next();//콘솔에서 메뉴를 읽어 들이는 부분이다.
			switch(menu){//콘솔에 사용자가 입력한 메뉴 종류에 따라 해당하는 요청을 처리하는 메소드를 호출하는 부분이다. 
			case "1"://프로그램을 계속 실행할지를 판단하는 부분이다.
				boardSVC.writeArticle(sc);
				break;
			case "2":
				boardSVC.listArticles(sc);
			case "3":
				boardSVC.removeArticle(sc);
				break;
			case "4":
				isStop = true;
			}
		}while(!isStop);//isStop 변수 앞에 !를 지정하여 isStop 값이 false일 경우 프로그램이 계속 실행 된다.
	}
}
