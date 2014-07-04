class ImportantThread1 extends Thread{//중요한 작업을 반복해서 처리하는 스레드 클래스를 정의하였다.
	public ImportantThread1(String name){
		super(name);
	}

	@Override
	public void run() {
		for(int i =1; i<=15; i++){
			System.out.println(currentThread().getName());
		}
	}
}
class NotImportantThread1 extends Thread{//중요하지 않은 작업을 반복해서 처리하는 스레드 클래스를 정의하였다.
	public NotImportantThread1(String name){
		super(name);
	}

	@Override
	public void run() {
		for(int i=1; i<=15; i++){
			System.out.println(currentThread().getName());
		}
	}
}
public class priorityTest2 {
/**
 * 우선순위를 적용한 멀티 스레드
 */
	public static void main(String[] args) {
		ImportantThread1 it= new ImportantThread1("중요한작업");//각 스레드 객체를 생성하였다.
		NotImportantThread1 nit = new NotImportantThread1("중요하지 않은 작업");
		it.setPriority(Thread.MAX_PRIORITY);//it 스레드에 최고 우선순위를 지정하였다.
		nit.setPriority(Thread.MIN_PRIORITY);//nit스레드에 최소 우선순위를 지정하였다.
		
		nit.start();//스레드 시작하는 부분이다.
		it.start();//스레드 시작하는 부분이다.
		
	}
}
