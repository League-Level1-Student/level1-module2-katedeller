
public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isWoman && isKnighted) {
			return "Lady " + name;
		} else if (isWoman && isKnighted == false) {
			return "Ms. " + name;
		}

		else if (isWoman == false && isKnighted == false) {
			return "Mr " + name;
		} else {
			return "Sir " + name;
		}

	}
}