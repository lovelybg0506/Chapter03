package part01.sec01.exam02;

public class Ex03_12 {

	public static void main(String[] args) {
		
		int a,b;
		char c,d,e;
		
		a=0xF90A; // 0x =>16진수표기법 / F=15 / 
		b=0x50;
		
		System.out.printf("%c\n",a);
		
		c=(char)b;
		System.out.printf("%c %d\n",c,(int)c);

		d='#';
		System.out.printf("%c의 ASCII값은 %d입니다\n",d,(int)d);
		
		e='나';
		System.out.printf("%c %d\n",e,(int)e);
		
	}

}
