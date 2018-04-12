import java.awt.Point;

public class Dimension 
{
	int x, y;
	Dimension(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public Point getDimensions()
	{
		Point p = new Point(x,y);
		return p;
		
	}
	public String toString()
	{
		return "(" + x + ", " + y + ")"; 
	}

}
