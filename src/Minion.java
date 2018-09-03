
public class Minion {

	String name;
	int x;
	String color;
	String master;

	Minion(String name, int x, String color, String master) {
		this.name = name;
		this.color = color;
		this.x = x;
		this.master = master;

	}

	int getEyes() {
		return x;
	}

	String getMaster() {
		return master;
	}

	void setEyes(int x) {
		this.x = x;
	}

	void setMaster(String master) {
		this.master = master;
	}

	String getName() {
		return name;
	}

	String getColor() {
		return color;
	}

	void setName(String name) {
		this.name = name;
	}

	void setColor(String color) {
		this.color = color;
	}
}
