import javax.swing.JOptionPane;

public class TaeMakerRunner {
public static void main(String[] args) {
	Kettle kettle = new Kettle();
	kettle.boil();
	String flavor = JOptionPane.showInputDialog("What kind of tea do you want?");
	TeaBag teabag = new TeaBag(flavor);
	Cup cup = new Cup();
	cup.makeTea(teabag, kettle.getWater());
	
}
	public TaeMakerRunner() {
		// TODO Auto-generated constructor stub
	}

}
