
public class Test07 {
/**
 * 사칙연산 테스트
 * 
 */
	public static void main(String[] args) {
		
		int no1=Integer.parseInt(args[0]);
		int no2=Integer.parseInt(args[2]);
		String Orper = args[1];
		int result=0;
		
		if(Orper.equals("+")){
			result=no1+no2;
			System.out.println(result);
		//	System.out.println(no1+"+"+no2+"="+result );
			
		}else if(Orper.equals("-")){
			result=no1-no2;
			System.out.println(result);
		}else if(Orper.equals("/")){
			result=no1/no2;
			System.out.println(result);
		}else if(Orper.equals("X")){
			result=no1*no2;
			System.out.println(result);
		}else if(result !=0){
			System.out.println(no1+"+"+no2+"="+result );
		}else{
			System.out.println("연산자가 잘못되었습니다.");
		}
		
	}
}
