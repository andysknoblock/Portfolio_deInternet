
public class BankAccount 
{
	private double balance, interest=0;
	BankAccount(double initialMoney)
	{
		balance=initialMoney;
	}
	BankAccount(double initialMoney, double interest)
	{
		balance=initialMoney;
		this.interest=interest;
	}
	public void setInterest(double interest)
	{
		this.interest=interest;
	}
	public void addInterest()
	{
		balance*=(1+interest);
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double dolla)
	{
		balance+=dolla;
	}

}
