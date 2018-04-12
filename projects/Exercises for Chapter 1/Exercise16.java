import javax.swing.JOptionPane;
public class Exercise16 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showInputDialog("Well hello there " + name +". What would you like me to do?");
		JOptionPane.showMessageDialog(null, "HA, good try but of course I can't do that " + name + ". What did you expect??");
	}

}