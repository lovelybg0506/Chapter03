package part01.sec01.exam02;

public class Ex03_05 {

	public static void main(String[] args) {

		System.out.printf("%d\n",123);
		System.out.printf("%5d\n",123); //�ڸ����� 5�ڸ����� ����
		System.out.printf("%05d\n",123); //�տ� �����ڸ��� 0���� ��ü
		System.out.printf("%10d\n",123456);
		

		System.out.printf("%f\n",123.45);// �⺻ �Ҽ��� 6�ڸ������� ���
		System.out.printf("%7.1f\n",123.45); //4������ �����ߵǴµ� �ڿ� 5�� �ݿø� (7�̶�� ���ڴ� . ���� ������ ĭ ��)
		System.out.printf("%7.3f\n",123.45); //�Ҽ���3�ڸ� ���� �����ϴµ� 0�̶� .450���
	
		System.out.printf("%s\n","Hi~~Java");
		System.out.printf("%10s\n","Hi~~Java");
		
	}

}
