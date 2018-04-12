import java.util.ArrayList;

public class InsertionPoint {

	public static void main(String[] args) 
	{
		int accounts=10,temp=0;
		BankAccountFilter filter = new BankAccountFilter();
		BankAccount[] b = new BankAccount[accounts];
		ArrayList<BankAccount> b1 = new ArrayList<BankAccount>();
		BankAccountMeasurer bMeas;
		for (int i=0;i<b.length;i++)
		{
			b[i] = new BankAccount((Math.random()*3000));
			if (filter.accept(b[i],1000))
			{
				b1.add(b[i]);
			}
		}
		System.out.println("Bank accounts accepted:");
		for (BankAccount element: b1)
		{
			System.out.println(element.getBalance());
		}
		System.out.println(b1.size() + " out of " + accounts + " accounts were accepted");
	}

}
