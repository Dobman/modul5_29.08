package a_Zadania.b_Dzien_2.b_Wzorce_projektowe.facade;

public class AtmApi {
	
	BankAccount bankAccount;
	Transfer transfer;
	PhoneCard phoneCard;
	Loan loan;
	
	public AtmApi(){
		bankAccount = new BankAccount();
		transfer = new Transfer();
		phoneCard = new PhoneCard();
		loan = new Loan();
	}

	public double deposit(){
		return bankAccount.deposit();
	}

	public void transferMoney() {
		transfer.transferMoney();
	}

	public void payOut() {
		bankAccount.payOut();
	}

	public void recharge() {
		phoneCard.recharge();
	}

	public void getLoan() {
		loan.getLoan();
	}
}
