package inheritance;

import encapsule.Kaup;

public class MinusAccount extends Account{
	 private int money;
	 private int restMoney;
	public static final String BANK_NAME = "러시앤캐시"; 
		
	public void loan(){
	System.out.println(BANK_NAME);
	}
	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		super.deposit(money);
	}
	@Override
	public void withdraw(int money) {
		if (money > restMoney - 300) {
			System.out.println("출금가능");
		} else {

		}
		super.withdraw(money);
	}

}
