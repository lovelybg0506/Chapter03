package part01.sec01.exam01;

public class StringConcatExample_04 {

	public static void main(String[] args) {

		String str1="JDK"+6.0;
		String str2=str1+"특징";
		System.out.println(str2);
		
		String str3="JDK"+3+3.0; //문자열이 먼저나오면 뒤에있는 연산들은 그냥 연결됨
		String str4=3+3.0+"JDK"; // 숫자가 먼저나오면 연산이 된 후 문자열과 합쳐짐
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
