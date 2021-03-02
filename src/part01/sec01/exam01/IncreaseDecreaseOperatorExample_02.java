package part01.sec01.exam01;

public class IncreaseDecreaseOperatorExample_02 {

	public static void main(String[] args) {

		int x=10;
		int y=10;
		int z=0;
		
		System.out.println("--------------------------");
		x++; // 자신 변수의 값을 1증가 시킨다.
		++x; // 
		System.out.println("x="+x);
		
		System.out.println("--------------------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		System.out.println("--------------------------");
		z=x++; // 변수뒤에 ++가 붙으면 변수의 값을 먼저 대입한다
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("--------------------------");
		z=++x; // 변수 앞에 ++가 붙으면 증가한 값을 대입한다
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("--------------------------");
		z=++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
