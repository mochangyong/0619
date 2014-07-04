class ImportantThread extends Thread{//중요한 작업을 반복해서 처리하는 스레드 클래스를 정의하였다
	public ImportantThread(String name){
		super(name);
	}

	@Override
	public void run() {
		for(int i=1; i<=15; i++){
			System.out.println(currentThread().getName());
		}
	}
}
class NotImportantThread extends Thread{//중요하지 않는 작업을 반복해서 처리하는 스레드 클래스를 정의하였다.
	public NotImportantThread(String name){
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=15; i++){
			System.out.println(currentThread().getName());
		}
	}
}
public class PriorityTest1 {
/**
 * 우선순위를 적용하지 않는 멀티 스레드
 */
	public static void main(String[] args) {
		ImportantThread it = new ImportantThread("중요한 작업");//각 스레드 객체를 생성하였다.
		NotImportantThread nit = new NotImportantThread("중요하지 않는 작업");
		nit.start();//스레드를 사작하는 부분이다.
		it.start();//스레드를 사작하는 부분이다.
	}
}
