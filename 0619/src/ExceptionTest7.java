class ArgsException extends Exception{
	 private int argsNumber;//프로그램을 실행할 때 입력한 인자의 개수를 저장할 변수를 정의한 부분이다. 예외 클래스에 추가적이 정보를 담아야 
	 //할 것이 있으면 변수를 정의해서 저장할 수도 있고, 기능이 필요하면 메소드를 정의해서 사용할 수 도 있다.
	public int getArgsNumber() {
		return argsNumber;
	}
	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}
	public ArgsException(String msg){//Exception 클래스에 정의되어 있는 String 타입의 인자를 받는 생성자를 호출해서 메시지를 초기화 
		super(msg);//시키면서 예외 객체를 생성하는 생성자를 정의한 부분이다.
	}
}//Exception 클래스를  상속받아서 사용자 정의 예외를 정의하는 부분이다.
public class ExceptionTest7 {
	/**
	 * 사용자 정의 예외 테스트
	 */
	public static void main(String[] args) {
		try{
			if(args.length !=2){//인자가 두 개 입력되지 않았으면 ArgsExceptio 객체를 생성하여 발생시키는 부분이다.
				ArgsException ae = new ArgsException("인자를 두개 입력해야 합니다.");
				ae.setArgsNumber(args.length);
				throw ae;
			}else{//인자가 두개  제대로 입력되었으면 두 인자 값의 합을 구해서 출력해 주는 부분이다.
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				
				System.out.println(num1 + "+" +num2 + "=" +(num1+num2));
			}//예외가 발생할 만한 부분을 try블록으로 묶어준 부분이다.
		}catch(ArgsException a){//ArgsException 객체가 던져지면 해당 예외 객체의 정보를 출력해 주는 부분이다.
			System.out.println(a.getMessage());//getMessage 메소드는 Exception클래스에서 제공되는 메소드로서 해당 예외 객체의
			//메시지를 리턴한다. 또한 Exception 클래스의 printStackTrace()메소드를 이용하면  stack을 추적하면서 메소드 호출 관계와 예외 
			//정보를 출력할 수 있다.
			System.out.println("당신이 입력한 인자 수는  "+a.getArgsNumber()+"개입니다.");
		}
	}

}
