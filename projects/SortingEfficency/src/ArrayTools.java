import java.util.Random;

public class ArrayTools 
{
	private static Random rando = new Random();
	public static int[] randomIntArray(int length, int n)
	{
		int[] a = new int[length];
		for (int i=0;i<a.length;i++)
		{
			a[i] = rando.nextInt(n);
		}
		return a;
	}

}
