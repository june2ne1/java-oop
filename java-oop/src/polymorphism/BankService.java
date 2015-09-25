package polymorphism;
/**
 *  t시용자 은행업무 프로그램
 */

import java.util.Scanner;

public class BankService implements Bank{
  Account account = new Account();
  Scanner scanner = new Scanner(System.in);
  
@Override
public void deposit() {
	System.out.println("입금액을 입력해 주세요");
	int inputMoney = scanner.nextInt();
	account.deposit(inputMoney);
	System.out.println("입금된 금액"+account.getRestMoney());
	
}

@Override
public void withdraw() {
	System.out.println("출금 할 금액");
	int outputMoney = scanner.nextInt();
	account.withdraw(outputMoney);
	
}

@Override
public void search() {
	System.out.println("현재 남은 계좌 "+account.getRestMoney());
	
	
}

@Override
public void open() {
	System.out.println("이름 입력");
	String ownerName =scanner.next();
	System.out.println("비번 입력");
	int password = scanner.nextInt();
	
	
	
	account.setOwnerName(ownerName);
	account.setPassword(password);
	
	System.out.println(account.toString());
	
}
  

}
  
