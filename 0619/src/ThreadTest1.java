class MyThread extends Thread{//Thread 클래스를 상속받아서 클래스로 정의하는 부분이다.
	public MyThread(String name){//Thread의 이름을 초기화시키는 생성자를 정의한 부분이다.
		super(name);
	}

	@Override
	public void run() {
		for(int i=1; i<=20;i++){//해당 스레드가 실행될때 반복문을 실행하면서 특정 기능을  수행하는 부분이다.
			try{
				System.out.print(currentThread().getName());//현재 실행되고 있는 스레드의 이름을 출력하는 부분이다.
				sleep(10);//스레드 이름을 출력하고 10밀리 초동안 실행을 중지하는 부분이다.
				for(int j=1; j<=i;j++){//"$" 문자를 i 변수의 개수 만큼 출력하는 부분이다.
					System.out.print("$");
				}
				System.out.println();//"$"문자를 출력한 후 줄 바꿈을 처리하는 부분이다.
			}catch(InterruptedException e){//sleep 메소드는 InterruptedException을 발생할 수 있기 때문에 해당 예외를 처리해 주는 부분이다.
				e.printStackTrace();
			}
		}
	}
}
public class ThreadTest1 {
/**
 * Thread 클래스로 스레드 생성하기
 */
	public static void main(String[] args) {
		MyThread myThread = new MyThread("myThread1");//스레드 이름을 'myThread1'으로 지정하면서 스레드 객체를 생성하는 부분이다.
		myThread.start();//myThread를 시작시키는 부분이다. start()메소드를 호출하면 새로운 callstack 을 할당받고 Runnable 상태가 되었
		//다가 스레드 스케줄러에 의해서 선택되면 Running 상태가 되면서 해당 스레드의 run()메소드가 실행된다.
	}
}
