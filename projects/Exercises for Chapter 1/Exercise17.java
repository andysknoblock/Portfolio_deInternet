import java.net.*;
import javax.swing.*;
public class Exercise17 {

	public static void main(String[] args) throws Exception
	{
		URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
		JOptionPane.showMessageDialog(null, "Hello there! I'm a tight image", "Freaky Pic", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));

	}

}
