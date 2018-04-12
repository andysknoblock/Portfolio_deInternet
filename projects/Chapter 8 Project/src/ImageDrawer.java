import javax.swing.*;

public class ImageDrawer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1400,1000);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Componentry c = new Componentry();
		frame.add(c);
		frame.setVisible(true);
		

	}

}
