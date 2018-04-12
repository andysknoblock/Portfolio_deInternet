
public class Exercice4 {

	public static void main(String[] args) 
	{
		float i = 1000;
		int t =0;
		while (t<3)
		{
			i*=1.05;
			System.out.println("Your balance after " + t + " years is: $" + i);
			t++;
		}

	}

}
