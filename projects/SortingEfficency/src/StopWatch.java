
public class StopWatch 
{
	private long elapsedTime;
	private long startTime;
	StopWatch()
	{
		reset();
	}
	public void start()
	{
		startTime=System.currentTimeMillis();
	}
	public void reset()
	{
		elapsedTime=0;
	}
	public void stop()
	{
		elapsedTime = System.currentTimeMillis()-startTime;
	}
	public long getElapsedTime()
	{
		return elapsedTime;
	}

}
