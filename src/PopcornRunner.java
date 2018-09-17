import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	Microwave microwave = new Microwave();
	JOptionPane.showInputDialog("What kind of popcorn would you like?");
	JOptionPane.showInputDialog("How long does the popcorn need to cook for?");
	Popcorn popcorn = new Popcorn("butter");
	microwave.putInMicrowave(popcorn);
	
	
}
	public PopcornRunner() {
		// TODO Auto-generated constructor stub
	}

}
