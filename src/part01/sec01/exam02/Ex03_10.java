package part01.sec01.exam02;

public class Ex03_10 {

	public static void main(String[] args) {

		int a=100, b=200;
		double result;
		
		result=a/b; // ����/����==>���� 
		
		System.out.printf("%f\n", result);

		a=170;
		b=30;
		
		result=a/b;
		
		System.out.printf("%f\n", result);
		
		
	//  float w=0.1234f;  //���ٰ� ���� (floatŸ�Կ��� ���� �ڿ� f���̱�) 
		float w=(float)0.1234; // �Ǽ��� {double(8byte) ,float(4byte)}
		System.out.printf("%f\n", w);


		
	}

}
