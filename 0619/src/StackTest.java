import java.util.Stack;


public class StackTest {
/**
 * Stack 테스트
 */
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();//stack 객체를 생성하는 부분이다.
		
		stack.push("상계동");//stack 객체에 요소를 추가하는 부분이다.
		stack.push("서초동");
		stack.push("불광동");
		stack.push("이문동");
		
		while(!stack.isEmpty()){//stack에 저장 되어 있는 요소들을 출력하는 부분이다.
			System.out.println(stack.pop());//요소를 추가한 반대의 순서대로 출력된다.
		}
	}
}
