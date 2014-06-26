import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalendarTest {
/**
 * Calendar 클래스 테스트
 */
	public static void main(String[] args) {
		Calendar myCalendar = Calendar.getInstance();//Calendar 객체를 생성하는 부분이다.
		
		//값 설정
		myCalendar.set(Calendar.YEAR, 2000);//Calendar 객체에 setXXX메소드들을 사용해서 각 날짜 구성 값을 설정해 주는 부분이다.
		myCalendar.set(Calendar.MONTH, 9);
		myCalendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 30);
		myCalendar.set(Calendar.HOUR_OF_DAY, 11);
		myCalendar.set(Calendar.MINUTE, 2);
		myCalendar.set(Calendar.SECOND, 3);
		
		//출력 형식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:MM:SS");//날짜를 출력해 주는 형식을 정의하는 SimpleDateFormat 객체를 
		//날짜가 '연도 네자리:달 두자리:일 두자리 시간:분:초' 형태로 출력되게 정의하였다 
		DateFormat df = DateFormat.getDateTimeInstance();//날짜와 시간을 모두 출력하는 형태의 DateFormat 객체를 생성한 부분이다.
		Date date = myCalendar.getTime();//Calendar 객체의  getTIme()
		
		//날짜 출력
		System.out.println(sdf.format(date));//sdf형태의 포멧으로 날짜를 출력하는 부분이다.
		System.out.println(df.format(date));//df포멧으로 날짜를 출력하는 부분이다.
	}
}
