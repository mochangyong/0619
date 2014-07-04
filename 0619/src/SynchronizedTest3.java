class DressingRoomThread implements Runnable{//Runnable 인터페이스를 구현해서 스레드 클래스를 정의하고 있다.

	@Override
	public void run() {
		synchronized (this){//초기화 블록에서 DressingRoomThread 객체에 동기화를 처리하고 있다 이렇게 되면 하나의 스레드에서 
			//DressingRoomThread 클래스에 정의되어 있는 작업을 수행할 다른 스레드는 절대 DressimgRoomThread의 작업을 수행할 수 없다.
			for(int i=5;i>=1; i--){//for 반복문을 이용해서 얼마 정도 시간 후에 다른 손님이 룸에 들어갈 수 있는지를 출력해 주는 부분이다.
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
				System.out.println("dressing종료"+(i*10)+"초 전...");
			}
			System.out.println(Thread.currentThread().getName()+"dressimg 완료");//for문장이 완료되면 Dressing이 완료되었다는 것을 표시해 주는 
		}//부분이다.
	}
}
public class SynchronizedTest3 {
/**
 * 동기화 코드 블록 사용
 */
	public static void main(String[] args) {
		DressingRoomThread dr = new DressingRoomThread();//Runnable 객체를 생성하는 부분이다.
		
		Thread t1 = new Thread(dr,"첫 번째 손님");//같은 Runnable 객체를 타깃 Runnable 객체로 지정하면서 스레드 객체를 두개 생성하는 부분이다.
		Thread t2 = new Thread(dr,"두 번째 손님");
		
		t1.start();//두개의 스레드를 시작시키는 부분이다.
		t2.start();
	}
}
