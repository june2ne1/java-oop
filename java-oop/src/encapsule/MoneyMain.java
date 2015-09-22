package encapsule;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class MoneyMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Money2 money = new Money2();
		System.out.println("금액을 입력하세요");
		int input = scanner.nextInt();
		//int [] arr2 = new int[3];
		//int [] arr ={1,2,3};
		//String [] abc= {"5만원 2","만원 2","c"};
		String[] results = money.countMoney(input); //연결 파라미터 = 매개변수 리턴
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
			
		}
		
	}
}
