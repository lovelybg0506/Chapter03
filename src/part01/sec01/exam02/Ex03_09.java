package part01.sec01.exam02;

public class Ex03_09 {

	public static void main(String[] args) {

		int a,b,c,d;
		
		// ������ �ǹ� ==> ��Ȱ�� �ϱ� ���ؼ� ������ ���
		a=100+100;	//200
		b=a+100;	//300
		c=a+b-100; //400
		d=a+b+c;	//900
		
		System.out.printf("a,b,c,d�� �� ==>%d,%d,%d,%d\n",a,b,c,d);
		
		a=b=c=d=100;
		
		System.out.printf("a,b,c,d�� �� ==>%d,%d,%d,%d\n",a,b,c,d);
				
		a=100;
		a=a+200;
		a=a+200;
		
		System.out.printf("a�� �� ==>%d\n",a);
		
	}

}
