package polymorphism;

public class AdminService implements Admin {
	private Account[] accountList;
	private int count;
	public AdminService(){
		this(0);
	}
	
	public AdminService(int count) {
		accountList = new Account[1000];
	}
	
	public Account[] getAccountList() {
		return accountList;
	}

	public int getCount() {
		return count;
	}

	public void setAccountList(Account[] accountList) {
		this.accountList = accountList;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String openAccount(int accountNo, String name, int restMoney) {
		Account account = new Account();
		String msg = "";
		account.setAccountNo(accountNo);
		account.setOwnerName(name);
		account.setRestMoney(restMoney);
		accountList[count]=account;
		count ++;
		msg = account.toString();
				return msg;
		
	}

	
	@Override
	public Account searchAccountByAccountNo(int accountNo) {
		Account searchAccount = null;
		for (int i = 0; i < this.getCount(); i++) {
			if (true) {
				searchAccount = accountList[i];
				
			}
		}
		return null;
	}

	@Override
	public Account[] searchAccountsByName(String name) {
		int tempCount = 0;//searchAccountsByName(name);
		if (tempCount ==0) 
{	   return null;
			
		}
		Account[] tempList = new Account [tempCount];
		tempCount =0;
		for (int i = 0; i < tempList.length; i++) {
			//temCount++;
		}
		
		return tempList;
	}

	@Override
	public String closeAccount(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


	
}

