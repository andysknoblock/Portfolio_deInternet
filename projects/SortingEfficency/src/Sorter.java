
public class Sorter 
{
	int a[];
	Sorter(int[] a)
	{
		this.a=a;
	}
	public int[] selectionSort()
	{
		for (int i=0; i < a.length; i++)
		{
			int minPos = minimumPosition(i);
			swap(minPos, i);
		}
		return a;
	}
	public int minimumPosition(int i)
	{
		int minPos = i;
		for (int j = i+1; j < a.length ; j++)
		{
			if (a[j] < a [minPos])
			{
				minPos=j;
			}
		}
		return minPos;
	}
	public void swap(int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j]=temp;
	}

}
