import java.util.HashMap;


public class LoginSVC {
	private HashMap<String, String> loginDatas;
	private HashMap<String, User> userDatas;
	
	public LoginSVC(){//HashMap 객체를 생성하고 각 HashMap 객체에 필요한 데이터를 추가하는 부분이다.
		loginDatas= new HashMap<String,String>();
		userDatas= new HashMap<String,User>();
		loginDatas.put("java", "java");
		userDatas.put("java", new User("java","java","상계동",30,"오정원"));
	}
	public User login(String id,String passwd){//아이디와 비밀번호를 파라미터 값으로 받아서 로그인 처리를 해주는 메소드 영역이다.
		User user = null;
		if(loginDatas.containsKey(id)){//파라미터로 넘어온 이아디가 키인 loginDatas 맵에 저장되어 있는 값이 passwd 파라미터로 전송되어온
										//값하고 같은지를 비교하는 부분이다
			if(loginDatas.get(id).equals(passwd)){//인증에 성공했으면 userDatas 맵 객체에  인증된 아이디 키로 저장되어 있는 값을 가져와서 
												//uesr 변수에 초기화 시킨다. 즉 해당 아이디의 사용자 정보를 얻어온다.
			user=userDatas.get(id);
		}
	}
	return user;//최종적으로 인증된 사용자의 정보 객체를 반환해 준다. 인증에 실패하면  null 값이 반환 된다.
	}
}
