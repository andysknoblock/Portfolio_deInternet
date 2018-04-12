import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Photy 
{
	BufferedImage img;
	int x=0, y=0, width, height;
	Photy(int a) 
	{
		String path = "Space" + a + ".jpg";
		try {
			img = ImageIO.read(new File(path));
			width=img.getWidth();
			height = img.getHeight();
				
		} catch (IOException e) {
			System.out.println(path + " not found");
		}
	}
	public void setX(int x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public int getMinX()
	{
		return x;
	}
	public int getMinY()
	{
		return y;
	}
	public int getMaxX()
	{
		return x+width;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public int getMaxY()
	{
		return y+height;
	}
	public BufferedImage getImage()
	{
		return img;
	}

}
