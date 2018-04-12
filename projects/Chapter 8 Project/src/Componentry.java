import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class Componentry extends JComponent
{
	protected void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		Photy img [] = new Photy [15];
		for (int a=0;a<img.length;a++)
		{
			img[a] = new Photy(a);
		}
		int x=10,y=10,gap=10;
		img[0].setX(x);
		img[0].setY(y);
		g2.drawImage(img[0].getImage(), img[0].getMinX(), img[0].getMinY(), null);
		x+=img[0].getWidth()+gap;
		for (int a=1;a<img.length;a++)
		{
			y=0;
			int max=0;
			for (int b=0;b<a;b++)
			{
				if (x+img[a].getWidth()>1400)
				{
					x=gap;
				}
				float c = img[b].getMinX(),d=img[b].getMinY();
				float e = img[b].getMaxX(),f=img[b].getMaxY();
				if((x>=c && x<=e) || (x+img[a].getWidth()>=c && x+img[a].getWidth()<=e) || (x<=c && x+img[a].getWidth()>=e) && max+img[a].getHeight()>d )
				{
					if (f>max)
						max=(int) f;
				}
				if (max+gap+img[a].getHeight()>1000)
				{
					b=0;
					if (x%img[a].getWidth()!=0)
						x=0;
					else 
					{
						x+=img[a].getWidth();
					}
					if (x+img[a].getWidth()>=1400)
					{
						x=2200;
						max=2000;
						b=999;
					}
				}
			}
			y=max+gap;
			img[a].setX(x);
			img[a].setY(y);
			g2.drawImage(img[a].getImage(), img[a].getMinX(), img[a].getMinY(), null);
			x+=img[a].getWidth()+gap;
		}
	}

}
