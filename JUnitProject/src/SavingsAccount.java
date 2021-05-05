
import org.junit.jupiter.api.Test;

public class SavingsAccount
{
	
	
	private double bankBalance;
	SavingsAccount(double bankBalance)
	{
	super();
	this.bankBalance=bankBalance;
}
	void withdraw(double amountToWithdraw)
	{
		System.out.println("Withdrawing..."+amountToWithdraw);
		bankBalance = bankBalance - amountToWithdraw;
		//bankBalance = bankBalance - 20;
		
	}
	public double getBankBalance()
	{
		
	return bankBalance;
	
	
	}
	@Override
	public String toString() {
		return "SavingsAccount [bankBalance=" + bankBalance + "]";
	}
	}
