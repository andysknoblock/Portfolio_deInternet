
public class BankAccountMeasurer implements Measurer
{
	public double measure(Object anObject)
	{
		BankAccount b = (BankAccount) anObject;
		return b.getBalance();
	}
}
