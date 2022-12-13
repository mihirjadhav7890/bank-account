package bankaccount;

public class main {
	
	public static void main (String[] args) {
		
		Account AbhayAccount = new Account( "12345", 0.0, "Abhay","abhay@xyz.com","12121");
		
		AbhayAccount.DepositMoney(100);
		AbhayAccount.DepositMoney(1000);
		AbhayAccount.WithDrawMoney(200);
	}

}
