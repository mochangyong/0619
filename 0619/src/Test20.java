	
public class Test20 {
	public static void main(String[] args) {
		int num=3;
		int[] agr=new int[3];
		
		for(int i=0 ; i<agr.length;i++){
			agr[i]=num++;
			System.out.println(agr[i]);
		}
//		for(int i=0;i<agr.length;i++){
//			System.out.println(agr[i]);
//		}
	}
}
