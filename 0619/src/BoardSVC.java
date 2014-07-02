import java.util.ArrayList;
import java.util.Scanner;


public class BoardSVC {
	ArrayList<BoardVo> boardList;//게시판 글 정보를 BoardSVC객체 안에서 공유 될 수 있도록 ArrayList 타입의 boardList 변수를 멤버 변수로 정의한 부분
	
	public BoardSVC(){//생성자가 호출되자마자  boardList 객체가 생성되게 처리되는 부분이다.
		boardList = new ArrayList<BoardVo>();
	}
	public void writeArticle(Scanner sc){
		System.out.println("게시판 글을 작성하세요");
		System.out.println("작성장");//게시판에서 등록할 글 정보를 콘솔로부터 입력받는 부분이다. 입력받는 데이터 사이에 <Spacebar>가 존재하면 한 라인
		String register = sc.next();//을 읽을 수 있는 Scanner 클래스의 readLine()메소드를 이용하여 사용자의 입력 값을 읽어 들어도 된다.
		System.out.println("이메일");
		String email = sc.next();
		System.out.println("비밀번호");
		String passwd = sc.next();
		System.out.println("제목");
		String subject = sc.next();
		System.out.println("글내용");
		String content = sc.next();
		
		BoardVo boardVo = new BoardVo(register, subject, email, content, passwd);//콘솔로부터 입력받은 데이터를 이용해서 
		//게시판 글 정보 객체 하나를 생성하는 부분이다.
		addArticle(boardVo);//게시판 글 정보 객체 하나를 인자로 던지면서 해당 글 정보를 boardList객체 에 추가하는 기능을 하는 addArticle
		//메소드를 호출하는 부분이다.
	}
	private void addArticle(BoardVo boardVo){
		boardList.add(boardVo);//boardList객체에 BoardVo 객체 하나를 요소로 추가하는 부분이다. 즉 게시판 글 하나를 등록하는 부분이다.
	}
	public void listArticles(Scanner sc){//ArrayLIst 객체에 저장되어 있는 게시판 글 목록을 출력해 주는 메소드를 정의한 부분이다.32~40
		if(boardList.size()>0){//등록된 글 정보가  하나라도 존재하면 boardList객체에 저장되어 있는 글 목록의 정보를 출력하는
			for(int i = 0; i<boardList.size(); i++){//부분이다.
				System.out.println(boardList.get(i));//각 인덱스에 해당하는 BoardVo객체의 toString()메소드를 호출해서 정보를 출력하는 부분이다.
				//자바에서는 특정 객체가 System.out.println()메소드의 파라미터로 지정되면 해당 객체의 toString()메소드가 자동으로 호출된다.
			}
		}else{
			System.out.println("등록된 글이 없습니다.");
		}
	}

	public void removeArticle(Scanner sc){
		System.out.println("제거할 글의 작성자와 비밀번호를 입력하세요");
		System.out.println("작성자:");//제거할 글을 작성한 작성자와 비밀번호를 콘솔로부터 입력받는 부분이다. 본 예제에서는 작성자가 중복되지 않는다고
		String register = sc.next();//가정하였으며, 해당 작성자의 글을 삭제할 때 비밀번호가 일치해야 글을 삭제할 수 있도록 처리하였다
		System.out.println("비밀번호");//물론 완전환 게시판은 아니지만 ArrayList의 기능을 설명하기 위한 용도이다.
		String passwd = sc.next();
		
		removeArticle(register,passwd);//제거할 글의 작성자와 비밀번호를 인자로 전송하면서 해당 글을 삭제하는 기능을 하는 메소드를 호출하는 부분
	}
	private void removeArticle(String register, String passwd){
		if(boardList.size()>0){//boardList객체에 글을 하나라도 존재하는지를 판단하는 부분이다.
			int index=-1;//삭제할 글의 인덱스 번호를 저장할 변수를 정의한 부분이다.
			for(int i=0;i<boardList.size(); i++){
				if(boardList.get(i).getRegister().equals(register)){//파라미터로 전송되어 온 작성자 정보를 가지고 있는 BoardVo 객체를 찾아내는 부분 
					if(boardList.get(i).getPasswd().equals(passwd)){//해당 작성자가 작성한 글의 비밀번호가 파라미터로 전송되어 온 비밀번호와 일치하는지를
						//판단하는 부분이다.
						boardList.remove(boardList.get(i));//작성자의 비밀번호가 맞으면 해당 인덱스 영역에 저장되어 있는 BoardVo객체를 boardList 객
						//체에 서 제거하는 부분이다.
						index=i;//저거한 인덱스 번호를 index변수에 할당하는 부분이다.
					}
				}
			}
			if(index == -1 ){//제거하려는 작성자가 존재하지 않거나 비밀번호가 일치하지 않을때 즉 index값이 처음에 초기화 시킨 -1값으로 저장되어 있을때
			System.out.println("해당 작성자가 없거나 비밀 번호가 일치하지 않습니다.");//간단한 메시지를 출력하고 return예약어를 사용해서 메소드를 실
			return;//행을 종료하는 것이다.
			}
			}else{ //boardList객체에 BoardVo객체가 하나도 저장되어 있지 않을 때 즉 작성된 글이 하나도 없을 때  메시지를 출력해 주는 부분이다.
				System.out.println("작성된 글이 없습니다.");
	}
	
	}
}
