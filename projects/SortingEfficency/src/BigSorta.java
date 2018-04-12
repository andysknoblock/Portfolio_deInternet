import java.util.Arrays;

public class BigSorta {

	public static void main(String[] args) 
	{
		int[] jeepers = ArrayTools.randomIntArray(100000, 100);
		System.out.println(Arrays.toString(jeepers));
		StopWatch watch = new StopWatch();
		watch.start();
		Sorter s = new Sorter(jeepers);
		int[] jeepers2 = s.selectionSort();
		watch.stop();
		System.out.println("Elapsed time: " + watch.getElapsedTime());

	}

}
