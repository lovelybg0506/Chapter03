package part01.sec01.exam02;

public class Ex03_11 {

	public static void main(String[] args) {

		/*
		int a,b,c,d,e;
		
		a='A'; // 65
		System.out.printf("%c\t",a); //char
		System.out.printf("%d\t",a); //�������
		
//		char a,b,c,d,e; // Ÿ���� �޶� ���� �������� �����ؼ� �ȵ�.
		
		*/
		
		char a,b,c,d,e;
		a='A'; // 65
		System.out.printf("%c\t", a);
		System.out.printf("%d\n", (int)a); // a�� ĳ�������������� ��������.
		
		b='a'; // 97
//		c=b+1; // �⺻������ �̷������ ������4byte ������ �ȴ�.
		c=(char)(b+1); // b+1���� ��ȣ�� ������Ѵ�.
		System.out.printf("%c \t",b);
		System.out.printf("%c \t\n",c);
		
		d=90; // Z
		System.out.printf("%c \t\n",d);
		
		d='��';
		System.out.printf("%c \t\n",d);
		System.out.printf("%d \t\n",(int)d);
		
		e=(char)(d+1);
		System.out.printf("%c \t\n",e);
		System.out.printf("%d \t\n",(int)d);
		System.out.printf("%d \t\n",(int)e);
		
		
		
		
	}

}
