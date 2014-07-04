public class InOutProcess {
	public static int MAX_GUEST = 5;// 손님이 식당에 들어올 수 있는 최대의 인원 수를 상수로 정의한 부분이다.
	int guestNum=0;//현재 식당에 있는 손님의 인원을 0명으로 초기화 시켰다.
	
	public synchronized void inGuest(){//손님을 식당에 들어오게 하는 메소드를 정의한 부분이다.
		System.out.println("손님이 들어옴");
		guestNum++;//현재 식당의 손님 수를 하나 증가시킨다.
		System.out.println("현재의 손님은 "+guestNum + "명입니다.");//현재 식당의 손님 수를 출력해 준다.
		if(guestNum == MAX_GUEST){//손님의 인원수가 5명을 넘으면 손님이 그만 들어오게 처리하는 부분이다. wait메소드는 synchronized 블록에 서만 사용
			try{//이 가능하므로 메소드 앞에 synchronized를 지정한 것이다.
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
		public synchronized void outGuest(){//손님이 식사를 다하고 나갈때 현재 손님 수를 하나 줄이는 메서드를 정의한 부분이다.
			if(guestNum<1){//손님이 한 명 미만이 되면 더 이상 현재 손님 수를 줄이지 않게 처리하는 부분이다. 즉, ig 스레드를 waiting pool에서 꺼낸다
				notify();
				return;
			}
			System.out.println("손님이 나감");
			guestNum--;//현재 손님 수를 줄이는 부분이다. 
			System.out.println("현재의 손님은 " + guestNum +"명입니다.");//현재 손님 수를  출력해 주는 부분이다.
		}
		public static void main(String[] args) {
			InOutProcess ip = new InOutProcess();
			InGuestThread ig = new InGuestThread(ip);
			OutGuestThread og = new OutGuestThread(ip);
			
			ig.start();
			og.start();
		}
}
