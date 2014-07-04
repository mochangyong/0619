class EasyTicket1 implements Runnable{
	int ticketNum = 10;//잔여 좌석

	@Override
	public void run() {
		for(int i = 1; i<=10; i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			getTicket();
		}
	}
	public synchronized void getTicket(){//getTicket() 메소드를 동기화 시켜 주었기 때문에 정확하게 하나의 스레드가 해당 메소드의 작업을 수행
		//할 때는 절대 다른 스레드가 해당 메소드에 접근할 수 없다.
		ticketNum -=1;
		if(ticketNum<=0){
			System.out.println(Thread.currentThread().getName()+",");
			
			System.out.println("잔여 좌석이 없습니다.");
			return;
		}
		System.out.println(Thread.currentThread().getName()+",");
		System.out.println("현재 잔여 좌석은 "+ ticketNum+"좌석입니다.");
	}
}
public class SynchronizedTest2 {
/**
 * 동기화 작업을 적용한 경우
 */
	public static void main(String[] args) {
		EasyTicket1 et= new EasyTicket1();
		Thread et1 = new Thread(et,"ticketConsumer1");
		Thread et2 = new Thread(et,"ticketConsumer2");
		et1.start();
		et2.start();
	}
}
