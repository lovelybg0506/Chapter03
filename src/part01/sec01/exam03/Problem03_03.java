package part01.sec01.exam03;

import java.util.Scanner;

public class Problem03_03 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in); // 1350
		int money,c500,c100,c50,c10;
		
		System.out.print("## 교환할 돈은?");
		money=s.nextInt();
		// /,% 사용할것
		
//		c500 = money/500;                           		//내가혼자해본것
//		c100 = (money-c500*500)/100;						   
//		c50 = (money-((c500*500)+(c100*100)))/50;
//		c10 = (money-((c500*500)+(c100*100)+(c50*50)))/10;
//		money = 10%((c500*500)-(c100*100)-(c50*50)-(c10*10));  //모르겠다
//		
		c500 = money/500;		// 정답.
		money = money%500;
		
		c100 = money/100;
		money = money%100;
		
		c50 = money/50;
		money = money%50;
		
		c10 = money/10;
		money = money%10;
		
		
		System.out.printf("\n오백원짜리==>%d개\n",c500);
		System.out.printf("\n백원짜리==>%d개\n",c100);
		System.out.printf("\n오십원짜리==>%d개\n",c50);
		System.out.printf("\n십원짜리==>%d개\n",c10);
		System.out.printf("바꾸지 못한 잔돈==>%d원\n", money);

	}

}
