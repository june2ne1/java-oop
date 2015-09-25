package polymorphism;

import java.security.Provider.Service;
import java.util.Scanner;

public class HanbitOffice {
	public static void main(String[] args) {
	   AccountService adminService = new 
		Account account = new Account();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("사용자화면 :1.계좌개설 2.입금 3.출금 4.조회 5.종료");
			System.out.println("관리자화면 : 6.검색(계좌번호) 7.검색(이름) 8.해지 9.총계좌수");
			int key =scanner.nextInt();
			 switch (key) {
				case 1:
					System.out.println("계좌번호입력");
					int accountNo =scanner.nextInt();
					System.out.println("이름 입력");
					String name = scanner.next();
					System.out.println("입금액 입력");
					int restMoney = scanner.nextInt();
					Service.openAccount(accountNo,)
							break;
				case 2: break;
				case 3:break;
				case 4: break;
				case 5: return;
				  }
		}
			
		}
	}


