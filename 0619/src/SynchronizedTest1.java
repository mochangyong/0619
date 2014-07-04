class EasyTicket implements Runnable{//클래스를 정의 할 때 Runnable 인터페이스를 구현하면서 정의하는 부분이다.
	int ticketNum=10;//잔여 좌석수를 저장할 변수를 정의한 부분이다.

	@Override
	public void run() {
		for(int i = 1; i <=10; i++){//티켓을 구매하는 메소드를 10번 호출하는 부분을 정의하였다.
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		getTicket();
		}
	}
	public void getTicket(){
		ticketNum-=1;//티켓을 구매했을때 잔여 좌석수를 감소 시키는 부분이다.
		if(ticketNum<=0){//잔여 티켓수가 0이 되면 잔여 좌석수가 부족하다고 메시지를 출력하고 메소드를 빠져나가도록 구현한 부분이다.
			System.out.print(Thread.currentThread().getName());
			
			System.out.println("잔여 좌석이 없습니다.");
			return;
		}
		System.out.print(Thread.currentThread().getName()+",");//현재 스레드 이름을 출력해 주는 부분이다.
		System.out.println("현재 잔여 좌석은"+ticketNum+"좌석입니다.");//현재 남은 티켓 수를 출력해 주는 부분이다. 본 예제의 경우 동기화 작업을 
		//해주지 않았으므로 좌석수가 0이 되어도 이부분이 출력될수 있다.
	}
}

public class SynchronizedTest1 {
/**
 * 동기화 작업을 해 줒 않을 경우
 */
	public static void main(String[] args) {
		EasyTicket et = new EasyTicket();
		Thread et1 =new Thread(et,"ticketConsumer1");//Runnable 객체를 공유하면서 스레드 객체 두 개를 생성하는 부분이다.
		Thread et2 = new Thread(et,"ticketConsumer2");
		et1.start();//스래드 두개를 실행하는 부분이다.
		et2.start();
		}
}
