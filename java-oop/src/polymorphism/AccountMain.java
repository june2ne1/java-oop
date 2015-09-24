package polymorphism;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		while (true) {
			System.out.println("동작선택 1번 : 통장개설 2번 : 입금 3번 :출금 4번 : 조회 5번 : 마감");
		
			int key = scanner.nextInt();
			switch (key) {
			case 1:
			//타입=classname   객체   = 뉴    생성자
			System.out.println("이름 입력");
			String ownerName =scanner.next();
			System.out.println("비번 입력");
			int password = scanner.nextInt();
			
			
			
			account.setOwnerName(ownerName);
			account.setPassword(password);
			
			System.out.println(account.toString());

				
				break;
				
			case 2:
				System.out.println("입금액을 입력해 주세요");
			int inputMoney = scanner.nextInt();
			account.deposit(inputMoney);
			System.out.println("입금된 금액"+account.getRestMoney());
			
			break;
			
			case 3:
				System.out.println("출금 할 금액");
				int outputMoney = scanner.nextInt();
				account.withdraw(outputMoney);
				System.out.println("출금이후잔액"+account.getRestMoney());
				break;
			case 4: 
				System.out.println("현재 남은 잔액 "+account.getRestMoney());
					
				
				break;
			
			case 5:
				System.out.println("종료");
				
				return;
			

			default:
				break;
			}
		}
	
	

   }

}