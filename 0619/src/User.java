
public class User {
	private String id;//사용자의 각 정보를 저장할 변수를 선언한 부분이다.
	private String passwd;
	private String dong;
	private int age;
	private String name;
	public User(String id,String passwd, String dong,int age, String name){//모든 멤버 변수의 값을 초기화 시키는 생성자를 정의한 부분이다.
		super();
		this.id=id;
		this.passwd=passwd;
		this.dong=dong;
		this.age=age;
		this.name=name;
	}
	public String getId() {//모든 변수에 대한 setXXX,getXXX메소드를 정의한 부분이다.
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {//해당 객체의 정보를 리턴해 준 toString()메소드를 재정의한 부분이다.
		// TODO Auto-generated method stub
		return "아이디 =" + id + ",이름 = "+name+ ",나이 ="+age+",비밀번호 ="+passwd+",동 =" +dong;
	}
	
	
}
