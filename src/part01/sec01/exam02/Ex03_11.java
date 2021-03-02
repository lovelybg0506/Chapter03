package part01.sec01.exam02;

import java.util.Scanner;

public class Ex03_11 {

	public static void main(String[] args) {

		/*
		int a,b,c,d,e;
		
		a='A'; // 65
		System.out.printf("%c\t",a); //char
		System.out.printf("%d\t",a); //정수출력
		
//		char a,b,c,d,e; // 타입이 달라도 위와 변수명이 동일해서 안됨.
		
		*/
		
		char a,b,c,d,e,f;
		a='A'; // 65
		System.out.printf("%c\t", a);
		System.out.printf("%d\n", (int)a); //a를 캐스팅하지않으면 에러가남.
		
		b='a'; // 97
//		c=b+1; // 기본연산이 이루어지면 무조건4byte 연산이 된다.
		c=(char)(b+1); // b+1에도 괄호를 쳐줘야한다.
		System.out.printf("%c \t",b);
		System.out.printf("%c \t\n",c);
		
		d=90; // Z
		System.out.printf("%c \t\n",d);
		
		d='가';
		System.out.printf("%c \t\n",d);
		System.out.printf("%d \t\n",(int)d);
		
		e=(char)(d+1);
		System.out.printf("%c \t\n",e);
		System.out.printf("%d \t\n",(int)d);
		System.out.printf("%d \t\n",(int)e);

		
	}

}
