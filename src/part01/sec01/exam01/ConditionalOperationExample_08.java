package part01.sec01.exam01;

public class ConditionalOperationExample_08 {

	public static void main(String[] args) {

		int score=85;
		
		//조건연산자, ? 다음 true일 시 'A'가 grade에 대입, false일시 :오른쪽 실행
		// =(대입연산자): 변수(메모리 공간) = 값
		char grade=score>90? 'A':((score>80)? 'B':'C');
		System.out.println(score+"점은"+grade+"등급입니다.");
		
		
	}

}
