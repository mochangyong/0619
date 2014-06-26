import static java.lang.System.out;

import static db.JdbcUtil.*;

public class StaticImportTest {
/**
 *static import 테스트
 */
	public static void main(String[] args) {
		out.println("static import test");
		connect();
		close();
	}
}
