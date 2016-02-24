
public class BreCon {

	public int fakul(int zahl) {
		int result = 1;
		while (true) {
			if (zahl < 1) {
				break;
			}
			result *= zahl;
			zahl--;
		}
		return result;
	}

	public int rekFakul(int zahl) {
		if (zahl == 1)
			return 1;
		else {
			return rekFakul(zahl - 1) * zahl;
		}
	}
}
