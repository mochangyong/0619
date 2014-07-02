
public class BoardVo {
	private String register;//게시판 하나의 정보를 구성하는 속성들을 선언한 부분이다.
	private String subject;
	private String email;
	private String content;
	private String passwd;
	public  BoardVo(String register, String subject, String email,//게시판 글의 각속성 값들을 초기화 시키는 생성자를 정의한 부분이다.
			String content,String passwd){
		super();
		this.register=register;
		this.subject=subject;
		this.email=email;
		this.content=content;
		this.passwd=passwd;
	}
	
	public String getRegister() {//각 속성에 외부에서 접근할 수 있는 setXXX메소드와 getXXX메소드를 정의한 부분이다.
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() { //해당 객체의 정보를 원하는 형태로 반환해 주기 위해 toString()메소드를 오버라이딩 한 부분이다.
		
		return "작성자:"+register+",이메일:"+email+",제목:"+subject+",글 내용:"+content;
	}
	
	
	
}
