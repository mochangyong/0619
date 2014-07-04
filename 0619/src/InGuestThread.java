public class InGuestThread extends Thread{//클래스를 스레드 클래스로 정의하는 부분이다.
	InOutProcess ip;
	
	public InGuestThread(InOutProcess ip){//InOutProcess 객체를 초기화 시키는 생성자를 정의한 부분이다.  각 스레드에서 
		this.ip=ip;//InOutProcess에서 정의한 기능을 사용해야 되기 때문에 InOutProcess 객체를 파라미터로 받고 있다
	}

	@Override
	public void run() {
		for(int i=1; i<10; i++){//for문을 반복하면서 InOutProcess의 inGuest() 메소드를 호출하는 부분을 정의하였다
			ip.inGuest();
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
