package part01.sec01.exam03;

import java.util.Scanner;

public class Problem03_02 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		float a,b; // float(4byte)
		float result;
		
		System.out.printf("첫번째 계산할 값을 입력하세요==> ");
		a = s.nextFloat(); // 실수 type
		System.out.printf("두번째 계산할 값을 입력하세요==> ");
		b = s.nextFloat();  
		
		result=a+b;
		System.out.printf("%5.2f+%5.2f=%5.2f\n",a,b,result);
		
		result=a-b;
		System.out.printf("%5.2f-%5.2f=%5.2f\n",a,b,result);
		
		result=a*b;
		System.out.printf("%5.2f*%5.2f=%5.2f\n",a,b,result);
		
		result=a/b;
		System.out.printf("%5.2f/%5.2f=%5.2f\n",a,b,result);
		
		result=a%b;
		System.out.println("result= "+result);
		
//		result=3.0%2.0; // 나머지연산자는 실수값으로 계산할 수 없음
//		System.out.println("result= "+result);

		result=(int)a%(int)b; // casting할 때 원래 변수의 타입은 변하지 않는다.
		System.out.println("result= "+(int)a%(int)b);
		System.out.println("result= "+result);
		System.out.printf("%d %% %d = %d\n", (int)a,(int)b,(int)result); // 여기서도 casting 해줘야함
		
	}
}
