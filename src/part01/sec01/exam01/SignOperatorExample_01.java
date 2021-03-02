package part01.sec01.exam01;

public class SignOperatorExample_01 {

	public static void main(String[] args) {
		
		short s=100;	//short = 2byte (-32768~32767)
//		short s2=0;
		int s2=0;
		
		System.out.println("s="+s);
		s=-100;
		System.out.println("s="+s);
//		s2=-s; // 변수에  -기호를 붙이면 연산이 된다 그러므로 4byte 연산으로
		s2=-s;
		System.out.println("s2="+s2);
		
		
	}

}
