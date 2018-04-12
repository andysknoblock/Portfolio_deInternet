
public class BankAccountFilter implements Filter
{
	public boolean accept(Object anObject, double value)
	{
		BankAccountMeasurer meas = new BankAccountMeasurer();
		if (meas.measure(anObject)>value)
			return true;
		else
			return false;
		
	}

}
