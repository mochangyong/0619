
	/*
	 * 상단 예제 코드의 자바 소스 파일의 경우 하나의 자바 소스 파일에  Args클래스와  Test29 클래스 두개를 생성하였다 이렇게 자바
	 * 소스 파일 하나에 클래스를 여러 개 정의하는 것은 가능하지만 하나의 소스 파일에는 
	 * 하나의 public 클래스만 생성될 수 있다 즉, 클래스를 여러 개 정의하여도 하나의 클래스에만 public 접근 제한자를 지정할 수 있고, 
	 * 소스 파일 저장할때 반드시 public 접근 제한자가 지정된 클래스 이름으로 자바 소스 파일 명을 지정해야 한다. 
	 */
	class Args{
		int x;
		void add(int x) {//메소드에서 기본 타입의 파라미터 값을 x변수에 받아 x변수의 값에 50을 더하는 메소드 이다 이부분에서 
			 x= x+50;	//메서드 안에 있는 x변수는 메소드에서 정의한 로컬 변수로 인식되고, 클래스에서 정의한 x변수로  인식되지
		}				//않아는다 따라서 메소드 실행 후에도 x멤버 변수의 값에는 변화가 없다.
		void add(Args arg){ //객체의 레퍼런스 값이 복사되에 arg 변수에 할당되기 때문에 arg변수에서 가리키는 객체가 arg.add(arg);에서 
			arg.x=arg.x+40;//파라미터로 전송되어 오는 레퍼런스 값이 가리키는 객체와 동일하다. 따라서 메소드를 실행하고 나면 
		}//Args arg = new Args();부분에서 생성된 객체 ㅌqustn rkqtdl qusrudehlsek.
		void addNew(Args arg){//처음 arg.addNew(arg);부분에서 레퍼런스 값을 파라미터로 전송했을때 arg변수에 Args arg = new Args();부분에서
			arg = new Args();//생성한 객체를 가리키는 레퍼런스 값이 할당되지만, arg=new Args();부분에서 새로운 객체를 만들어서 새로운 객체의 레퍼런스 값이
			//다시 arg변수에 할당되기 때문에 최종적으로 메소드 안에 있는 arg변수는 Args arg = new Args();부분에서 생성된 객체를 가리키지 않는다
		}//따라서 메소드를 실행한 후 Args arg = new Args();부분에서 생성된 객체에는 아무런 변화가 없다.
		void add(int[] arr){//배열도 객체이다. 따라서 메소드로 배열의 레퍼런스 값이 복사되어 전송되어 오기 때문에 arr[0]++를 실행하면
			arr[0]++;//int[] arr = new int[1];부분에서  생성된 배열의 0번 인덱스의 값을 바로 1로 증가된다. 
		}								
	}
	public class Test29 {
	/**
	 * 인수 전달 방식 테스트
	 */
		public static void main(String[] args) {
			Args arg = new Args();
			arg.x=100;
			int[] arr = new int[1];
			
			arg.add(arg.x);
			System.out.println("arg.x="+arg.x);
			arg.add(arg);
			System.out.println("arg.x="+arg.x);
			arg.addNew(arg);
			System.out.println("arg.x ="+arg.x );
			
			arg.add(arr);
			System.out.println(("arr[0] ="+arr[0]));
			
		}
}