package encapsule;


import java.util.Scanner;

/**
 * @file_name : Money2.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 22.
 * @story     :
 */
public class Money2 {
	/**
	 * 예를 들어서 134,530원이면 
	 *  거스름돈을 화폐로 표시해주면 5만원 : 2, 1만원 :3,..
	 *  표시하고 10원미만은 절삭
	 */
	public String[] countMoney(int money) {
		int [] moneyUnit = {50000,10000,5000,1000,500,100,50,10};
		int[] moneyCount = new int[moneyUnit.length];
		String[] results = new String[moneyUnit.length];
		for (int i = 0; i < moneyCount.length; i++) {
			moneyCount[i] = money /moneyUnit[i];
			money = money % moneyUnit[i];
			results[i]=moneyUnit[i]+"원:"+moneyCount[i];
		}
		return results;
	}
}
	/**
	 * 22 : moneyUnit과 같은 index의 moneyCount 에는 화폐의 수를 저장한다.
	 * 25 : moneyUnit[0] = 5만원권, 전체금액을 5만원권으로 나눈 몫을 구한다.
	 */
