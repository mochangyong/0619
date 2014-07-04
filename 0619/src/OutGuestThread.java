public class OutGuestThread extends Thread{
	InOutProcess ip;
	
	public OutGuestThread(InOutProcess ip){
		this.ip=ip;
	}

	@Override
	public void run() {
		for(int i = 1;i<10; i++){//for문을 반복하면서 InOutProcess의 outGuest()메소드를 호출하는 부분을 정의하였단
			ip.outGuest();
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}